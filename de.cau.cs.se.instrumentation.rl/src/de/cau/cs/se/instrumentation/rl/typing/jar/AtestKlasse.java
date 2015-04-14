package de.cau.cs.se.instrumentation.rl.typing.jar;

import java.io.IOException;

/**
 * testclass
 * TODO delete class
 *
 * @author Yannic
 *
 */
public class AtestKlasse {

	public static void main(final String[] args) throws IOException {

		final JarModelTypeURIHelper temp = new JarModelTypeURIHelper();
		// System.out.println(temp.createResourceURI().toString());
		final JarModelResource a = new JarModelResource(temp.createResourceURI());
		a.load(null);

		// final JarModelGlobalScopeProvider b = new JarModelGlobalScopeProvider();
		// b.getParentTypeScope(a, null, null, null);

		/*
		 * System.out.println(a.getAllContents().toString());
		 * System.out.println(a.getContents());
		 * System.out.println("\n" + "Types :");
		 * for (int i = 0; i < a.getContents().size(); i++) {
		 * final ModelImpl b = (ModelImpl) a.getContents().get(i);
		 * System.out.println(b.getTypes());
		 * }
		 */
		// System.out.println(AtestKlasse.class.getResource((temp.createResourceURI().toString())).getPath());

	}

}
