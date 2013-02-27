###############################################################################
# Perl/Kieker/Writer/FileWriter.pm
# 
# Singleton-Implementierung von Schreibfunktionen in das Dateisystem.
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

package Kieker::Writer::FileWriter;

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

    # Generiere Dateinamen aus aktuellem Datum und Uhrzeit
    (my $sec,my $min,my $hour,my $mday,my $mon,my $year,my $wday,my $yday,my $isdst) = localtime(time);
    my $filename = 'kieker_monitoring_output_'.($year+1900).'-'.sprintf("%02d", ($mon+1)).'-'.$mday.'_'.$hour.':'.$min.':'.$sec.'.log';
    # Öffne Dateihandler
    open(my $filehandle, "> $filename") || die ("can't open output file: $!");

    my $this = {
      file => $filehandle
    };
    $oneTrueSelf = bless $this, $type;
  }

  return $oneTrueSelf;
}

# Generische Schreibfunktionen für Strings
# Aufbereitung im Rahmen der Probe
sub write {
  my $self = shift;
  my $handle = $self->{file};
  my $old_fh = select($handle);
  $| = 1;
  select($old_fh);
  print $handle shift;
}

1;
