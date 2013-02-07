###############################################################################
# Perl/test.pm
# 
# Miniatur-Test für rudimentäres Verhalten.
# Zufällige Berechnung von Fibonacci Zahlen
# 
###############################################################################

use strict;
use Kieker::Writer::JMSWriter;
use Kieker::Record::OperationEntryEvent;
use Kieker::Record::OperationExitEvent;
use Kieker::Controlling;
use CGI;
my $kieker_probe_cgi = CGI->new();
my $kieker_probe_session = Kieker::Controlling->sessionid($kieker_probe_cgi);
my $kieker_probe_writer = Kieker::Writer::JMSWriter->instance();
use warnings;

my $limit = int(rand(100));

for (my $i=0;$i<$limit;$i++){
  print fib($i)."\n";
  sleep($i);
}



sub fib {
(my $kieker_probe_package, my $kieker_probe_filename, my $kieker_probe_line, my $kieker_probe_subroutine, my $kieker_probe_hasargs,
  my $kieker_probe_wantarray, my $kieker_probe_evaltext, my $kieker_probe_is_require, my $kieker_probe_hints, my $kieker_probe_bitmask, my $kieker_probe_hinthash) = caller(0);
  my $kieker_probe_record = Kieker::Record::OperationEntryEvent->new($kieker_probe_subroutine,$kieker_probe_filename,$kieker_probe_session,Kieker::Controlling->time());
  $kieker_probe_writer->write($kieker_probe_record->genoutput());
  my $n = shift;
  $n *= 20;
  
  if ($n <= 1) {
my $kieker_probe_record = Kieker::Record::OperationExitEvent->new($kieker_probe_subroutine,$kieker_probe_filename,$kieker_probe_session,Kieker::Controlling->time());
    $kieker_probe_writer->write($kieker_probe_record->genoutput());
    return 1
  } else {
    my $a = 1;
    my $b = 1;
    for (my $cnt=2;$cnt<$n;$cnt++) {
      my $tmp = $b;
      $b += $a;
      $a = $tmp;
    }
my $kieker_probe_record = Kieker::Record::OperationExitEvent->new($kieker_probe_subroutine,$kieker_probe_filename,$kieker_probe_session,Kieker::Controlling->time());
    $kieker_probe_writer->write($kieker_probe_record->genoutput());
    return $b;
  }
}
