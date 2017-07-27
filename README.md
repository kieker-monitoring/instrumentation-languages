# Instrumentation Languages

The application and system monitoring framework Kieker (http://kieker-monitoring.net/) 
provides measuring sensors (also called probes) to collect a wide variety of information
of running software systems including call traces and system utilization. While its
main focus are JVM languages, Kieker also supports Perl and C. In addition students
have integrated it in Delphi/Pascal, and there are realizations for C# and VisualBasic 6.
Furthermore, it supports a wide variety of aspect weaving and interceptor technologies to
introduce monitoring code without modifying the original applications.

However, each technology must be configured separately, data records for the different
languages must be reimplemented for every languages, and API modifications or
extensions require to touch every single record type. This is quite cumbersome.
Therefore, we developed the Instrumentation Record Language (IRL) which provides
an technology independent definition for record structures. Based on the IRL
generators produce code for various target languages including Java, C and Perl.

The generator API is also simple and easy to use. So it can be extended for other 
languages and other purposes. For example, tests for records can automatically be 
generated.

As a supplement, we also developed the Instrumentation Aspect Language (IAL), which
realizes an abstraction for defining probes and allows to define point cuts
to instruct weavers and configure interceptor configurations to integrate the probes
into the running application.

## Instructions on Contribution
If you like to contribute
- a generator for a new programming language or
- an enhanced version of a generator already available
then please open a pull request.

Below, you find some instructions on how to set up the necessary IDE. 

### Requirements
If you want to contribute to the record language (rl), then you need to install:
- Eclipse distribution: "Eclipse DSL Tools" (the distribution "Eclipse for Java Developers" is not sufficient)
- Eclipse Plugin: tycho configurator 0.8
- Eclipse Plugin: xtext complete sdk 2.12 (2.10 not sufficient)
- Eclipse Plugin: geco from http://build.se.informatik.uni-kiel.de/eus/geco/snapshot/

After installing the required Eclipse plugins, you need to clean and to rebuild all Eclipse projects which do not start with "kieker.develop.al".
If you want to contribute to the aspect language (in short: al), then you need to install:
- Eclipse Plugin: Palladio Component Model from https://sdqweb.ipd.kit.edu/eclipse/palladiosimulator/releases/1.0.0/
- (details on request)

#### Import Projects into Eclipse 
Please note that you also need to execute "Maven->Update Project..." on each project if you chose to import "Existing Projects into Workspace" or "Projects from Git".
This step is not necessary if you chose to import "Existing Maven Projects".
