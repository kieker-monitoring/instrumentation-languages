/**
 * 
 */
package de.cau.cs.se.kieker.service.server;

import java.util.Map;

import kieker.common.configuration.Configuration;
import kieker.common.record.IMonitoringRecord;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;

import org.apache.commons.cli.ParseException;

import de.cau.cs.se.kieker.service.tcp.TCPServerService;

/**
 * @author rju
 * 
 */
public class CLIServer {

	static Option type;
	static Option port;
	static Option user;
	static Option password;
	static Option url;

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
			CommandLine line = parser.parse(options, args);
			
			if (line.hasOption("type")) {
				if (line.getOptionValue("type").equals("tcp-client")) {
					
				} else if (line.getOptionValue("type").equals("tcp-server")) {
					if (line.hasOption("port")) {
						int port = Integer.parseInt(line.getOptionValue("port"));
						Configuration configuration = null;
						Map<Integer, Class<IMonitoringRecord>> recordList = null;
						TCPServerService service = new TCPServerService(configuration,recordList,port);
						// TODO define cmd line output handler (optional)
						try {
	                        service.run();
                        } catch (Exception e) {
	                        // TODO Auto-generated catch block
	                        e.printStackTrace();
                        }
					}
				} else if (line.getOptionValue("type").equals("jms-client")) {
					
				} else if (line.getOptionValue("type").equals("jms-embedded")) {
					
				} else {
					System.err.println("Unknown service type: '" +line.getOptionValue("type") + "'" );
					
					HelpFormatter formatter = new HelpFormatter();
					formatter.printHelp("cli-kieker-service", options);
				}
			}
		} catch (ParseException exp) {
			// oops, something went wrong
			System.err.println("Parsing failed.  Reason: " + exp.getMessage());

			HelpFormatter formatter = new HelpFormatter();
			formatter.printHelp("cli-kieker-service", options);
		}
	}

	private static Options declareOptions() {
		Options options = new Options();

		type = OptionBuilder
		        .withArgName("type")
		        .hasArg()
		        .withDescription(
		                "select the service type: tcp-client, tcp-server, jms-client, jms-embedded")
		        .create("type");
		options.addOption(type);

		port = OptionBuilder
		        .withArgName("port")
		        .hasArg()
		        .withDescription(
		                "listen at port (tcp-server or jms-embedded) or connect to port (tcp-client)")
		        .create("port");
		options.addOption(port);

		user = OptionBuilder.withArgName("user").hasArg()
		        .withDescription("user name for a JMS service").create("user");
		options.addOption(user);

		password = OptionBuilder.withArgName("password").hasArg()
		        .withDescription("password for a JMS service").create("password");
		options.addOption(password);

		url = OptionBuilder.withArgName("url").hasArg().withDescription("URL for JMS server")
		        .create("url");
		options.addOption(url);
		
		// TODO missing kieker configuration option (optional, if not present uses default)
		// TODO missing mapping file option

		return options;
	}
}
