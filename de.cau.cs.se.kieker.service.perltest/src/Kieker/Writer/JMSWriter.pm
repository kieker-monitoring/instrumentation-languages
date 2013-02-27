###############################################################################
# Perl/Kieker/Writer/JMSWriter.pm
# 
# Singleton-Implementierung von Schreibfunktionen in einen JMS-Stream.
# Verwendet Net::STomp für die JMS Kommunikation
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

package Kieker::Writer::JMSWriter;

use Net::Stomp;

use strict;
use warnings;

# Singleton Instanz
my $oneTrueSelf;

# Kein Konstruktor mit 'new' bereitgestellt. 
# Initiallisierung geschieht mittels 'instance'.

sub instance {
  # Pruefe Singleton
  unless (defined $oneTrueSelf) {
    my $type = shift;

    my $stomp = Net::Stomp->new( { hostname => 'localhost', port => '61613' } );
	$stomp->connect( {} );

    my $this = {
      handle => $stomp
    };

    $oneTrueSelf = bless $this, $type;
  }

  return $oneTrueSelf;
}

# Generische Schreibfunktionen für Strings
# Aufbereitung im Rahmen der Probe
sub write {
  my $self = shift;
  my $handle = $self->{handle};
  my $msg = shift;
  $handle->send(
      { destination => 'de.cau.cs.se.kieker.service', body => $msg } );
}

1;
