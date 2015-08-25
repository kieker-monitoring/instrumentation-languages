package de.cau.cs.se.instrumentation.rl.typing.jar;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EcoreFactory;

import de.cau.cs.se.instrumentation.rl.recordLang.Model;
import de.cau.cs.se.instrumentation.rl.recordLang.RecordLangFactory;
import de.cau.cs.se.instrumentation.rl.recordLang.TemplateType;
import de.cau.cs.se.instrumentation.rl.recordLang.Type;
import de.cau.cs.se.instrumentation.rl.recordLang.impl.ClassifierImpl;
import de.cau.cs.se.instrumentation.rl.recordLang.impl.ConstantImpl;
import de.cau.cs.se.instrumentation.rl.recordLang.impl.ModelImpl;
import de.cau.cs.se.instrumentation.rl.recordLang.impl.PropertyImpl;
import de.cau.cs.se.instrumentation.rl.recordLang.impl.RecordTypeImpl;
import de.cau.cs.se.instrumentation.rl.recordLang.impl.TemplateTypeImpl;
import de.cau.cs.se.instrumentation.rl.recordLang.impl.TypeImpl;

/**
 * Creates RecordLang-Model-Instances of given classes.
 * Used by ClassFinder.
 *
 * @author Yannic Kropp
 *
 */

public class DynamicEMFHelper {

	// Metamodel-Factory
	private final RecordLangFactory rlFactory;

	// models; one per package in jar
	private final List<Model> models;

	/**
	 * Constructor, instantiates this.rlFactory and this.models; adds default model to this.models
	 */
	protected DynamicEMFHelper() {

		this.rlFactory = RecordLangFactory.eINSTANCE;

		this.models = new ArrayList<Model>();

		// default model
		final ModelImpl modelInstance = (ModelImpl) this.rlFactory.createModel();
		modelInstance.setName("default");
		this.models.add(modelInstance);
	}

	/**
	 * creates models and types from given list of classes
	 *
	 * @return - created models
	 */
	protected List<Model> createTypes(final ArrayList<Class<?>> cl) {

		// first run
		for (int i = 0; i < cl.size(); i++) {
			this.firstRun(cl.get(i));
		}

		// second run
		for (int i = 0; i < cl.size(); i++) {
			this.secondRun(cl.get(i));
		}

		// remove default-model iff not used
		if (this.models.get(this.existsModel("default")).getTypes().isEmpty()) {
			final int index = this.existsModel("default");
			this.models.remove(index);
		}

		// return this.models for resource-creation
		return this.models;
	}

	/**
	 * Creates mostly empty type-instance, adds it to model; if necessary creates model
	 */
	private void firstRun(final Class cl) {
		if (cl.isInterface()) {
			final TemplateTypeImpl rec = (TemplateTypeImpl) this.rlFactory.createTemplateType();
			// name
			rec.setName(cl.getCanonicalName());

			// add to Model or create new Model
			if (cl.getPackage() != null) {
				final int index = this.existsModel(cl.getPackage().getName());
				if (index != -1) {
					// add to existing Model
					final EList<Type> temp = this.models.get(index).getTypes();
					temp.add(rec);
				}
				else {
					// create new Model
					final ModelImpl newModel = (ModelImpl) this.rlFactory.createModel();
					newModel.setName(cl.getPackage().getName());
					final EList<Type> temp = newModel.getTypes();
					temp.add(rec);
					this.models.add(newModel);
				}
			}
			else {
				// add to default
				final int index = this.existsModel("default");
				final EList<Type> temp = this.models.get(index).getTypes();
				temp.add(rec);
			}
		}
		else {// = if RecordType
			final RecordTypeImpl rec = (RecordTypeImpl) this.rlFactory.createRecordType();
			// name
			rec.setName(cl.getCanonicalName());

			// set abstract
			rec.setAbstract(Modifier.isAbstract(cl.getModifiers()));

			// add to Model or create new Model
			if (cl.getPackage() != null) {
				final int index = this.existsModel(cl.getPackage().getName());
				if (index != -1) {
					// add to existing model
					final EList<Type> temp = this.models.get(index).getTypes();
					temp.add(rec);
				}
				else {
					// create new Model
					final ModelImpl newModel = (ModelImpl) this.rlFactory.createModel();
					newModel.setName(cl.getPackage().getName());
					final EList<Type> temp = newModel.getTypes();
					temp.add(rec);
					this.models.add(newModel);
				}
			}
			else {
				// add to default
				final int index = this.existsModel("default");
				final EList<Type> temp = this.models.get(index).getTypes();
				temp.add(rec);
			}
		}

	}

	/**
	 * sets attributes of correlated type
	 */
	private void secondRun(final Class cl) {
		// model of class
		TypeImpl correlatedType = null;
		for (int i = 0; i < this.models.get(this.existsModel(cl.getPackage().getName())).getTypes().size(); i++) {
			if (cl.getCanonicalName().equals(this.models.get(this.existsModel(cl.getPackage().getName())).getTypes().get(i).getName())) {
				correlatedType = (TypeImpl) this.models.get(this.existsModel(cl.getPackage().getName())).getTypes().get(i);
			}
		}

		// add RecordType parent
		if (!cl.isInterface()) {
			final Class parentCl = cl.getSuperclass();
			final RecordTypeImpl parent = this.existsParent(parentCl.getCanonicalName());

			final RecordTypeImpl child = (RecordTypeImpl) correlatedType;
			child.setParent(parent);
		}

		// add parents (TemplateTypes)
		final Class[] interf = cl.getInterfaces();
		final Collection<TemplateType> parents = new ArrayList<TemplateType>(0);
		for (final Class element : interf) {
			for (int p = 0; p < this.models.size(); p++) {
				for (int u = 0; u < this.models.get(p).getTypes().size(); u++) {
					if (element.getCanonicalName().equals(this.models.get(p).getTypes().get(u).getName())) {
						parents.add((TemplateType) this.models.get(p).getTypes().get(u));
					}
				}
			}
		}
		correlatedType.eSet(3, parents);

		// Constants and Properties
		final ArrayList<Object[]> attributes = this.getAttributes(cl);

		final ArrayList<ConstantImpl> constants = new ArrayList<ConstantImpl>(0);
		final ArrayList<PropertyImpl> properties = new ArrayList<PropertyImpl>(0);

		for (int i = 0; i < attributes.size(); i++) {
			final String name = (String) attributes.get(i)[0];
			final Class type = (Class) attributes.get(i)[1];
			final Integer isConst = (Integer) attributes.get(i)[2];

			if (isConst == 0) {
				final ConstantImpl con = (ConstantImpl) this.rlFactory.createConstant();
				con.setName(name);
				// setClassifier
				final ClassifierImpl cla = (ClassifierImpl) this.rlFactory.createClassifier();
				cla.setClass(this.createEClassifier(type));
				con.setType(cla);

				constants.add(con);
			}
			else {// = property
				final PropertyImpl prop = (PropertyImpl) this.rlFactory.createProperty();
				prop.setName(name);
				// set Classifier
				final ClassifierImpl cla = (ClassifierImpl) this.rlFactory.createClassifier();
				cla.setClass(this.createEClassifier(type));
				prop.setType(cla);

				properties.add(prop);
			}
		}
		correlatedType.eSet(4, properties);
		correlatedType.eSet(5, constants);
	}

	/**
	 * checks if model already exists, if it does returns index, if not -1
	 */
	private Integer existsModel(final String name) {
		Integer result = -1;
		if (name != null) {
			for (int i = 0; i < this.models.size(); i++) {
				if (this.models.get(i).getName().equals(name)) {
					result = i;
				}
			}
		}
		else {
			result = this.existsModel("default");
		}
		return result;
	}

	/**
	 * Checks if class is model-element; returns RecordType of class or null (e.g. if standard java-class like object)
	 */
	private RecordTypeImpl existsParent(final String name) {
		RecordTypeImpl result = null;
		for (int i = 0; i < this.models.size(); i++) {
			for (int p = 0; p < this.models.get(i).getTypes().size(); p++) {
				if (name.equals(this.models.get(i).getTypes().get(p).getName())) {
					result = (RecordTypeImpl) this.models.get(i).getTypes().get(p);
				}
			}
		}
		return result;
	}

	/**
	 * returns List of Attribute-Name, Attribute-Type pairs and an integer telling whether Constant (0) or Property (1)
	 */
	private ArrayList<Object[]> getAttributes(final Class cl) {
		final ArrayList<Object[]> result = new ArrayList<Object[]>(0);
		if (!cl.isInterface()) {
			final Field[] attr = cl.getDeclaredFields();
			for (final Field element : attr) {
				final int mod = element.getModifiers();
				final boolean pub = Modifier.isPublic(mod);
				final boolean stat = Modifier.isStatic(mod);
				final boolean fin = Modifier.isFinal(mod);
				final boolean priv = Modifier.isPrivate(mod);
				int type = -1;
				if (pub && stat && fin) {
					if (element.getName().startsWith("TYPE_SIZE") || "TYPES".equals(element.getName()) || element.getName().startsWith("CACHED_KIEKERRECORDS")) {
						// do nothing
					}
					else {
						type = 0;
					}
				}
				if (priv && fin && !stat) {
					type = 1;
				}

				final Object[] temp = { element.getName(), element.getType(), type };

				if (type != -1) {
					result.add(temp);
				}
			}
		}
		else {// = interface
			final Method[] methods = cl.getDeclaredMethods();
			for (final Method method : methods) {
				if (method.getName().startsWith("get")) {
					final Object[] temp = { method.getName().replaceFirst("get", ""), method.getReturnType(), 1 };
					result.add(temp);
				}
			}
		}
		return result;
	}

	/**
	 * returns EClassifier fitting to given class
	 */
	private EClassifier createEClassifier(final Class cl) {
		final EClassifier result = EcoreFactory.eINSTANCE.createEDataType();
		if (cl.isPrimitive() || "java.lang.String".equals(cl.getName())) {
			switch (cl.getName()) {
			case "int":
				result.setName("int");
				break;
			case "long":
				result.setName("long");
				break;
			case "short":
				result.setName("short");
				break;
			case "double":
				result.setName("double");
				break;
			case "float":
				result.setName("float");
				break;
			case "char":
				result.setName("char");
				break;
			case "byte":
				result.setName("byte");
				break;
			case "java.lang.String":
				result.setName("string");
				break;
			case "boolean":
				result.setName("boolean");
				break;
			default:
				result.setName(cl.getName());
				break;
			}
		}
		else {
			// TODO handle not-primitive datatypes
			// throw new UnsupportedOperationException("Non-Primitive Datatypes are not supported yet");
			System.out.println("\n" + "DynamicEMFHelper-> Non-Primitive Type: " + cl.getName() + "\n");
			result.setName("Non-Primitive (not supported yet)");
		}
		return result;
	}
}
