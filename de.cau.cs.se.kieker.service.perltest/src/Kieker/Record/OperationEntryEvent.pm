###############################################################################
# Perl/Kieker/Record/OperationEntryEvent.pm
# 
# Event für den Beginn einer Funktion.
#
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
package Kieker::Record::OperationEntryEvent;

use strict;
use warnings;

# Konstruktor fuer den Record
# Parameter: Zeitstempel, Trace, Aufrufindex, Funktionsname, Paketname
sub new {
  my $type = shift;
  my $this = {
    timestamp     => shift,
    traceID       => shift,
    orderIndex    => shift,
    functionName  => shift,
    packageName   => shift
  };
  
  return bless($this,$type);
}

# Serialisierung des EventRecords zur Ausgabe
sub genoutput {
  my $self = shift;
  return 
    "1;".$self->{timestamp}.";".$self->{traceID}.";".
    $self->{orderIndex}.";".$self->{functionName}.";".$self->{packageName};
}

1;
