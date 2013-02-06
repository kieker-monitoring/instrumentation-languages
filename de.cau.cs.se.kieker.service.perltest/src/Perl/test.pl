###############################################################################
# Perl/test.pm
# 
# Miniatur-Test für rudimentäres Verhalten.
# Zufällige Berechnung von Fibonacci Zahlen
# 
###############################################################################

use strict;
use warnings;

use Kieker::Writer::JMSWriter;
use Kieker::Record::OperationEntryEvent;
use Kieker::Record::OperationExitEvent;

use Kieker::Controlling;

my $kieker_writer = Kieker::Writer::JMSWriter->instance();
my $kieker_control = Kieker::Controlling->instance();
my $kieker_session = $kieker_control->getTrace();

my $limit = 10000000;

sub fib {
  my $kieker_record = Kieker::Record::OperationEntryEvent->new(
    Kieker::Controlling->time(),
    $kieker_session,
    $kieker_control->getOrderIndex($kieker_session),
    'fib','Test.pm');
  $kieker_writer->write($kieker_record->genoutput());
  
  my $n = shift;
  $n *= 20;
  
  if ($n <= 1) {
    my $kieker_record = Kieker::Record::OperationExitEvent->new(
      Kieker::Controlling->time(),
      $kieker_session,
      $kieker_control->getOrderIndex($kieker_session),
      'fib','Test.pm');
    $kieker_writer->write($kieker_record->genoutput());
    
    return 1
    
  } else {
    my $a = 1;
    my $b = 1;
    for (my $cnt=2;$cnt<$n;$cnt++) {
      my $tmp = $b;
      $b += $a;
      $a = $tmp;
    }

    my $kieker_record = Kieker::Record::OperationExitEvent->new(
      Kieker::Controlling->time(),
      $kieker_session,
      $kieker_control->getOrderIndex($kieker_session),
      'fib','Test.pm');
    $kieker_writer->write($kieker_record->genoutput());
      
    return $b;
  }
}

sub measure {
  my $kieker_record = Kieker::Record::OperationEntryEvent->new(
    Kieker::Controlling->time(),
    $kieker_session,
    $kieker_control->getOrderIndex($kieker_session),
    'measure','Test.pm');
  $kieker_writer->write($kieker_record->genoutput());
}

print "Perl STomp JMS test client v0.1\n\n";
print "Start calculations\n";

for (my $i=0;$i<$limit;$i++){
  measure(int(rand(20)));
  if ( ($i % 100) == 0 ) {
  	print "Records send ";
        print $i;
        print " \r";
  }
}

print "\ndone\n";

1;
