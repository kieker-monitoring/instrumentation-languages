/***************************************************************************
 * Copyright 2013 Kieker Project (http://kieker-monitoring.net)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ***************************************************************************/
package kieker.develop.rl.generator.java.record;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.reflect.Modifier;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

import org.eclipse.emf.common.util.EList;

import kieker.develop.rl.recordLang.BaseType;
import kieker.develop.rl.recordLang.Classifier;
import kieker.develop.rl.recordLang.Property;
import kieker.develop.rl.recordLang.RecordLangFactory;
import kieker.develop.rl.recordLang.RecordType;
import kieker.develop.rl.recordLang.TemplateType;
import kieker.develop.rl.validation.PropertyEvaluation;

/**
 * Reconstructed (more or less) the algorithm behind the serializeVersionUID computation.
 *
 * @author Reiner Jung
 *
 */
public final class ComputeUID {

	/**
	 * Creates blank class descriptor which should be initialized via a
	 * subsequent call to initProxy(), initNonProxy() or readNonProxy().
	 */
	private ComputeUID() {}

	/**
	 * Returns JVM type signature for given class.
	 */
	static String getClassSignature(final Classifier type) {
		final StringBuilder sbuf = new StringBuilder();
		if (type == null) { // void
			sbuf.append('V');
		} else {
			if (type.getSizes() != null) {
				for (int i = 0; i < type.getSizes().size(); i++) {
					sbuf.append('[');
				}
			}
			final String name = type.getType().getName();
			if ("int".equals(name)) {
				sbuf.append('I');
			} else if ("byte".equals(name)) {
				sbuf.append('B');
			} else if ("long".equals(name)) {
				sbuf.append('J');
			} else if ("float".equals(name)) {
				sbuf.append('F');
			} else if ("double".equals(name)) {
				sbuf.append('D');
			} else if ("short".equals(name)) {
				sbuf.append('S');
			} else if ("char".equals(name)) {
				sbuf.append('C');
			} else if ("boolean".equals(name)) {
				sbuf.append('Z');
			} else {
				// TODO must understand EObject, EClass, IRegistry and ByteBuffer
				// TODO classes are not supported yet.
				sbuf.append('L' + name.replace('.', '/') + ';');
			}
		}
		return sbuf.toString();
	}

	/**
	 * Returns JVM type signature for given list of parameters and return type.
	 *
	 * @param paramTypes
	 *            list of parameter types.
	 * @param retType
	 *            return type of a method.
	 *
	 * @returns a method signature as result
	 */
	private static String getMethodSignature(final Classifier[] paramTypes,
			final Classifier retType) {
		final StringBuilder sbuf = new StringBuilder();
		sbuf.append('(');
		for (final Classifier paramType : paramTypes) {
			sbuf.append(ComputeUID.getClassSignature(paramType));
		}
		sbuf.append(')');
		sbuf.append(ComputeUID.getClassSignature(retType));
		return sbuf.toString();
	}

	/**
	 * Computes the default serial version UID value for the given class.
	 *
	 * @param type
	 *            record type
	 */
	public static long computeDefaultSUID(final RecordType type) {
		try {
			final ByteArrayOutputStream bout = new ByteArrayOutputStream();
			final DataOutputStream dout = new DataOutputStream(bout);

			dout.writeUTF(type.getName());

			final int classMods = Modifier.PUBLIC | (type.isAbstract() ? Modifier.ABSTRACT : 0); // NOCS
			// | Modifier.FINAL shall we make them final?

			dout.writeInt(classMods);

			final EList<TemplateType> interfaces = type.getParents();
			final String[] ifaceNames = new String[interfaces.size()];
			for (int i = 0; i < interfaces.size(); i++) {
				ifaceNames[i] = interfaces.get(i).getName();
			}
			Arrays.sort(ifaceNames);
			for (final String ifaceName : ifaceNames) {
				dout.writeUTF(ifaceName);
			}

			// TODO supports only data properties
			final EList<Property> fields = type.getProperties();
			final MemberSignature[] fieldSigs = new MemberSignature[fields.size()];
			for (int i = 0; i < fields.size(); i++) {
				fieldSigs[i] = new MemberSignature(fields.get(i));
			}
			Arrays.sort(fieldSigs, new Comparator<MemberSignature>() {
				public int compare(final MemberSignature o1, final MemberSignature o2) {
					return o1.name.compareTo(o2.name);
				}
			});
			for (final MemberSignature sig : fieldSigs) {
				final int mods = Modifier.PRIVATE | Modifier.FINAL;
				// if (((mods & Modifier.PRIVATE) == 0) ||
				// ((mods & (Modifier.STATIC | Modifier.TRANSIENT)) == 0))
				dout.writeUTF(sig.name);
				dout.writeInt(mods);
				dout.writeUTF(sig.signature);
			}

			// TODO I guess we don't have a static initializer.
			// if (ComputeUID.hasStaticInitializer(type)) {
			// dout.writeUTF("<clinit>");
			// dout.writeInt(Modifier.STATIC);
			// dout.writeUTF("()V");
			// }

			final Collection<Property> allProperties = PropertyEvaluation.collectAllDataProperties(type);
			final Classifier[] paramListComplete = new Classifier[allProperties.size()];
			int j = 0;
			for (final Property property : allProperties) {
				paramListComplete[j++] = property.getType();
			}

			final Classifier[] paramListGeneric = new Classifier[1];
			final RecordLangFactory factory = RecordLangFactory.eINSTANCE;
			paramListGeneric[0] = factory.createClassifier();
			final BaseType objectType = factory.createBaseType();
			objectType.setName("Object");
			paramListGeneric[0].setType(objectType);

			final Classifier[] paramListGenericAbstract = new Classifier[2];
			paramListGenericAbstract[0] = paramListGeneric[0];
			paramListGenericAbstract[1] = factory.createClassifier();
			paramListGenericAbstract[1].setType(objectType);
			paramListGenericAbstract[1].getSizes().add(factory.createArraySize()); // unbound array

			final Classifier[] paramListFromBuffer = new Classifier[2];

			final Constructor[] cons = {
				new Constructor(type.getName(), EVisibility.PUBLIC, paramListComplete), // (final long timestamp, final long traceId, final int orderIndex)
				new Constructor(type.getName(), EVisibility.PUBLIC, paramListGeneric), // (final Object[] values) non abstract
				new Constructor(type.getName(), EVisibility.PROTECTED, paramListGenericAbstract), // (final Object[] values, final Class<?>[] valueTypes)
				new Constructor(type.getName(), EVisibility.PUBLIC, paramListFromBuffer), // (final ByteBuffer buffer, final IRegistry<String> stringRegistry) throws
																							// BufferUnderflowException"
			};
			final MemberSignature[] consSigs = new MemberSignature[cons.length];
			for (int i = 0; i < cons.length; i++) {
				consSigs[i] = new MemberSignature(cons[i]);
			}
			Arrays.sort(consSigs, new Comparator<MemberSignature>() {
				public int compare(final MemberSignature o1, final MemberSignature o2) {
					return o1.signature.compareTo(o2.signature);
				}
			});
			for (final MemberSignature sig : consSigs) {
				final Constructor constructor = (Constructor) sig.member;
				final int mods;
				switch (constructor.getVisibility()) {
				case PRIVATE:
					mods = Modifier.PRIVATE;
					break;
				case PROTECTED:
					mods = Modifier.PROTECTED;
					break;
				case PUBLIC:
					mods = Modifier.PUBLIC;
					break;
				default:
					mods = 0;
					break;
				}
				// list of all modifiers
				// (Modifier.PUBLIC | Modifier.PRIVATE | Modifier.PROTECTED |
				// Modifier.STATIC | Modifier.FINAL |
				// Modifier.SYNCHRONIZED | Modifier.NATIVE |
				// Modifier.ABSTRACT | Modifier.STRICT);
				if (constructor.getVisibility() != EVisibility.PRIVATE) {
					dout.writeUTF("<init>");
					dout.writeInt(mods);
					dout.writeUTF(sig.signature.replace('/', '.'));
				}
			}

			// TODO: this requires a rewrite
			// Kieker API methods must be added here too.
			final EList<Property> methods = type.getProperties();

			final Property[] methodsArray = methods.toArray(new Property[methods.size()]);
			for (int i = 0; i < methods.size(); i++) {
				methodsArray[i] = methods.get(i);
			}
			Arrays.sort(methodsArray, new Comparator<Property>() {
				public int compare(final Property o1, final Property o2) {
					int comp = o1.getName().compareTo(o2.getName());
					if (comp == 0) {
						comp = ComputeUID.getClassSignature(o1.getType()).compareTo(ComputeUID.getClassSignature(o2.getType()));
					}
					return comp;
				}
			});

			// TODO this produces only info on getters of properties and ignores other methods.
			for (final Property property : methodsArray) {
				final int mods = Modifier.PUBLIC | Modifier.FINAL;
				// supported modifiers
				// Modifier.PUBLIC | Modifier.PRIVATE | Modifier.PROTECTED |
				// Modifier.STATIC | Modifier.FINAL |
				// Modifier.SYNCHRONIZED | Modifier.NATIVE |
				// Modifier.ABSTRACT | Modifier.STRICT
				// if ((mods & Modifier.PRIVATE) == 0) {
				dout.writeUTF("get" + ComputeUID.firstToUpper(property.getName()));
				dout.writeInt(mods);
				dout.writeUTF(ComputeUID.getClassSignature(property.getType()).replace('/', '.'));
				// }
			}

			dout.flush();

			final MessageDigest md = MessageDigest.getInstance("SHA");
			final byte[] hashBytes = md.digest(bout.toByteArray());
			long hash = 0;
			for (int i = Math.min(hashBytes.length, 8) - 1; i >= 0; i--) {
				hash = (hash << 8) | (hashBytes[i] & 0xFF);
			}
			return hash;
		} catch (final IOException ex) {
			throw new InternalError();
		} catch (final NoSuchAlgorithmException ex) {
			throw new SecurityException(ex.getMessage());
		}
	}

	private static String firstToUpper(final String name) {
		String s = name;
		s = s.substring(0, 1).toUpperCase() + s.substring(1);
		return s;
	}

	/**
	 * Class for computing and caching field/constructor/method signatures
	 * during serialVersionUID calculation.
	 */
	private static class MemberSignature {

		private final Object member;
		private final String name;
		private final String signature;

		public MemberSignature(final Property field) {
			this.member = field;
			this.name = field.getName();
			this.signature = ComputeUID.getClassSignature(field.getType());
		}

		public MemberSignature(final Constructor cons) {
			this.member = cons;
			this.name = cons.getName();
			this.signature = ComputeUID.getMethodSignature(cons.getSignature(), null);
		}
	}

}
