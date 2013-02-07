###############################################################################
# Perl/Kieker/Controlling.pm
# 
# Kontroll und Hilfsfunktionen für die Monitoring Komponenten
# 
###############################################################################
# The MIT License (MIT)
# 
# Copyright (c) 2013 Nis Börge Wechselberg, Kiel, Germany
# 
# Permission is hereby granted, free of charge, to any person obtaining a
# copy of this software and associated documentation files (the "Software"),
# to deal in the Software without restriction, including without limitation 
# the rights to use, copy, modify, merge, publish, distribute, sublicense, 
# and/or sell copies of the Software, and to permit persons to whom the 
# Software is furnished to do so, subject to the following conditions:
# 
# The above copyright notice and this permission notice shall be included in 
# all copies or substantial portions of the Software.
# 
# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR 
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, 
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE 
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER 
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
# SOFTWARE.
###############################################################################
package Kieker::Controlling;

use strict;
use warnings;

use Time::HiRes qw(gettimeofday);

use Kieker::Record::Trace;
use Kieker::Writer::JMSWriter;


# gettimeofday stellt Zeit in (Sekunden,Mikrosekunden) bereit, verwende
# Timestamps im reinen Mikrosekunden Format
sub time {
  (my $s, my $usec) = gettimeofday();
  return ($s*1000000+$usec)*1000;
}

###############################################################################

# Singleton Instanz
my $oneTrueSelf;

# Kein Konstruktor mit 'new' bereitgestellt. 
# Initiallisierung geschieht mittels 'instance'.

sub instance {
  # Pruefe Singleton
  unless (defined $oneTrueSelf) {
    my $type = shift;
    my $this = {};
    
    $oneTrueSelf = bless $this, $type;
  }
  return $oneTrueSelf;
}

sub getOrderIndex {
  my $self = shift;
  my $trace = shift;
  if ($self->{$trace}) {
    my $orderIndex = $self->{$trace} + 1;
    $self->{$trace} = $orderIndex;
    return $orderIndex;
  } else {
    my $kieker_writer = Kieker::Writer::JMSWriter->instance();
    my $kieker_record = Kieker::Record::Trace->new($trace);
    $kieker_writer->write($kieker_record->genoutput());
    $self->{$trace} = 1;
    return 1;
  }
}

sub getTrace {
  return "1";
}

1;
