/**
 * 
 */
package de.cau.cs.se.kieker.service.server;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.Map;

import kieker.common.configuration.Configuration;
import kieker.common.record.IMonitoringRecord;
import kieker.monitoring.core.configuration.ConfigurationFactory;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import de.cau.cs.se.kieker.service.Service;
import de.cau.cs.se.kieker.service.ServiceListener;
import de.cau.cs.se.kieker.service.tcp.TCPClientService;
import de.cau.cs.se.kieker.service.tcp.TCPServerService;
import de.cau.cs.se.kieker.service.jms.JMSEmbeddedService;
import de.cau.cs.se.kieker.service.jms.JMSService;

/**
 * @author rju
 * 
 */
public class CLIServer {

	static boolean verbose;
	static boolean stats;
	static long startTime;
	static long deltaTime;

	/**
	 * 
	 */
	public CLIServer() {

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create the parser
		CommandLineParser parser = new GnuParser();
		Options options = declareOptions();
		try {
			// parse the command line arguments
			CommandLine commandLine = parser.parse(options, args);

			Map<Integer, Class<IMonitoringRecord>> recordList = null;
			Service service = null;

			// Verbosity setup
			verbose = commandLine.hasOption("v");

			// statistics
			stats = commandLine.hasOption("s");

			// Find libraries and setup mapping
			if (commandLine.hasOption("L")) {
				String libraries[] = commandLine.getOptionValues("L");

				if (commandLine.hasOption("m")) {
					recordList = readMapping(libraries, commandLine.getOptionValue("m"));
					if (recordList.size() == 0)
						usage("At least one mapping must be specified in the mapping file.", 5,
						        options);
				} else {
					usage("Mapping file is required.", 5, options);
				}
			} else {
				usage("At least one library reference is required.", 5, options);
			}

			// kieker setup
			Configuration configuration = null;
			if (commandLine.hasOption("k"))
				configuration = ConfigurationFactory.createConfigurationFromFile(commandLine
				        .getOptionValue("k"));
			else
				configuration = ConfigurationFactory.createDefaultConfiguration();

			// start service depending on type
			if (commandLine.hasOption("type")) {
				if (commandLine.getOptionValue("type").equals("tcp-client")) {
					if (commandLine.hasOption("port")) {
						if (commandLine.hasOption("host")) {
							int port = Integer.parseInt(commandLine.getOptionValue("port"));
							String hostname = commandLine.getOptionValue("host");
							service = new TCPClientService(configuration, recordList, hostname,
							        port);
							if (verbose)
								System.out.println("TCP client connected to " + hostname + ":"
								        + port);
						} else
							usage("Missing hostname for tcp client", 10, options);
					} else
						usage("Missing port for tcp client", 10, options);
				} else if (commandLine.getOptionValue("type").equals("tcp-server")) {
					if (commandLine.hasOption("port")) {
						int port = Integer.parseInt(commandLine.getOptionValue("port"));
						service = new TCPServerService(configuration, recordList, port);
						if (verbose)
							System.out.println("TCP server listening at " + port);
					} else
						usage("Missing port for tcp server", 10, options);
				} else if (commandLine.getOptionValue("type").equals("jms-client")) {
					String username = null;
					String password = null;
					if (commandLine.hasOption("u"))
						username = commandLine.getOptionValue("u");
					if (commandLine.hasOption("w"))
						password = commandLine.getOptionValue("w");
					if (commandLine.hasOption("url")) {
                        try {
                        	URI url = new URI(commandLine.getOptionValue("url"));
	                        service = new JMSService(configuration, recordList, username, password, url);
                        } catch (URISyntaxException e) {
                        	usage(commandLine.getOptionValue("url") + " is not a valid URI. JMS service cannot be started.", 10, options);
                        }
					} else
						usage("Missing URL for JMS service", 10, options);
				} else if (commandLine.getOptionValue("type").equals("jms-embedded")) {
					if (commandLine.hasOption("port")) {
						int port = Integer.parseInt(commandLine.getOptionValue("port"));
						try {
							service = new JMSEmbeddedService(configuration, recordList, port);
						} catch (URISyntaxException e) {
                        	usage(commandLine.getOptionValue("url") + " is not a valid URI. JMS service cannot be started.", 10, options);
                        }
					}
				} else {
					usage("Unknown service type: '" + commandLine.getOptionValue("type") + "'", 10,
					        options);
				}

				if (service != null) {
					if (verbose) {
						service.setListenerUpdateInterval(100);
						service.addListener(new ServiceListener() {

							@Override
							public void handleEvent(long count, String message) {
								System.out.print("Received " + count + " records\r");
								if (message != null)
									System.out.println("\n" + message);
							}

						});
					}

					try {
						if (stats)
							startTime = System.nanoTime();
						service.run();
						if (stats)
							deltaTime = System.nanoTime() - startTime;
						if (verbose)
							System.out.println("TCP server stopped.");
						if (stats) {
							System.out.println("Execution time: " + deltaTime + " ns  " + deltaTime
							        / 1000000000 + " s");
							System.out.println("Time per records: " + deltaTime
							        / service.getRecordCount() + " ns/r");
							System.out.println("Records per second: "
							        + ((double) service.getRecordCount())
							        / ((double) deltaTime / 1000000000));
						}
					} catch (Exception e) {
						System.err.println("CLIServer cannot start. Cause: " + e.getMessage());
					}
				}
			}
		} catch (ParseException exp) {
			// oops, something went wrong
			usage("Parsing failed.  Reason: " + exp.getMessage(), 20, options);
		}
	}

	private static void usage(String message, int code, Options options) {
		System.err.println(message);
		HelpFormatter formatter = new HelpFormatter();
		formatter.printHelp("cli-kieker-service", options, true);
		System.exit(code);
	}

	@SuppressWarnings("unchecked")
	private static Map<Integer, Class<IMonitoringRecord>> readMapping(String[] libraries,
	        String filename) {
		Map<Integer, Class<IMonitoringRecord>> map = new HashMap<Integer, Class<IMonitoringRecord>>();
		URL urls[] = new URL[libraries.length];
		for (int i = 0; i < libraries.length; i++) {
			try {
				urls[i] = new File(libraries[i]).toURI().toURL();
			} catch (MalformedURLException e) {
				System.err.println(libraries[i] + " is not a valid URL");
				System.exit(3);
			}
		}

		URLClassLoader classLoader = new URLClassLoader(urls, CLIServer.class.getClassLoader());

		try {
			BufferedReader in = new BufferedReader(new FileReader(filename));
			String line = null;
			do {
				try {
					line = in.readLine();
					if (line != null) {
						String pair[] = line.split("=");
						if (pair.length == 2) {
							Class<?> clazz = classLoader.loadClass(pair[1]);
							map.put(Integer.parseInt(pair[0]), (Class<IMonitoringRecord>) clazz);
						}
					}
				} catch (IOException e) {
					System.err.println("Mapping file \"" + filename + "\" read error. "
					        + e.getMessage());
					System.exit(2);
				} catch (ClassNotFoundException e) {
					System.err.println(e.getMessage());
				}
			} while (line != null);
			in.close();
		} catch (FileNotFoundException e) {
			System.err.println("Mapping file \"" + filename + "\" not found.");
			System.exit(1);
		} catch (IOException e) {
			System.err.println("Mapping file \"" + filename + "\" read error. " + e.getMessage());
			System.exit(2);
		}

		return map;
	}

	private static Options declareOptions() {
		Options options = new Options();
		Option option;

		// Type selection
		option = new Option("t", "type", true,
		        "select the service type: tcp-client, tcp-server, jms-client, jms-embedded");
		option.setArgName("type");
		option.setRequired(true);
		options.addOption(option);

		// TCP client
		option = new Option("h", "host", true, "connect to server named <hostname>");
		option.setArgName("hostname");
		options.addOption(option);

		// TCP server
		option = new Option("p", "port", true,
		        "listen at port (tcp-server or jms-embedded) or connect to port (tcp-client)");
		option.setArgName("number");
		option.setType(Number.class);
		options.addOption(option);

		// JMS client
		option = new Option("u", "user", true, "user name for a JMS service");
		option.setArgName("username");
		options.addOption(option);
		option = new Option("w", "password", true, "password for a JMS service");
		option.setArgName("password");
		options.addOption(option);
		option = new Option("l", "url", true, "URL for JMS server");
		option.setArgName("jms-url");
		option.setType(URL.class);
		options.addOption(option);

		// kieker configuration file
		option = new Option("k", "kieker", true, "kieker configuration file");
		option.setArgName("configuration");
		options.addOption(option);

		// mapping file for TCP and JMS
		option = new Option("m", "map", true, "Class name to id (integer or string) mapping");
		option.setArgName("map-file");
		option.setType(File.class);
		option.setRequired(true);
		options.addOption(option);

		// libraries
		option = new Option("L", "libraries", true, "Class name to id (integer or string) mapping");
		option.setArgName("paths");
		option.setType(File.class);
		option.setRequired(true);
		option.setValueSeparator(File.pathSeparatorChar);
		options.addOption(option);

		// verbose
		option = new Option("v", "verbose", false, "output processing information");
		option.setRequired(false);
		options.addOption(option);

		// statistics
		option = new Option("s", "stats", false, "output performance statistics");
		option.setRequired(false);
		options.addOption(option);

		return options;
	}
}
