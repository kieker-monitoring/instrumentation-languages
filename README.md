# Instrumentation Languages

The application and system monitoring framework Kieker(http://kieker-monitoring.net/) 
provides measuring sensors (also called probes) to collect a wide variatey of information
of running software systems including call traces and system utilization. While its
main focus are JVM languages, Kieker also supports Perl and C. In addition students
have integrated it in Delphi/Pascal, and there are realizations for C# and VisualBasic 6.
Furthermore, it supports a wide variety of aspect weaving and interceptor technologies to
introduce monitoring code without modifiying the original applications.

However, each technology must be configured separately, data records for the different
languages must be reimplemented for every languages, and API modifications or
extensions require to touch every single record type. This is quite cumbersome.
Therefore, we developed the Instrumentation Record Language (IRL) which provides
an technology independent definition for record structures. Based on the IRL
generators produce code for various target languages including Java, C and Perl.

The genrator API is also simple and easy to use. So it can be extended for other 
languages and other purposes. For example, tests for records can automatically be 
generated.

As a supplement, we also developed the Instrumentation Aspect Language (IAL), which
realizes an abstraction for defining probes and allows to define point cuts
to instruct weavers and configure interceptor configurations to integrate the probes
into the running application.

