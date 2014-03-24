use strict;
use warnings;

package kieker::common::record::controlflow::OperationExecutionRecord;

=head1 NAME

kieker::common::record::controlflow::OperationExecutionRecord 

=head1 SYNOPSIS

 my $record = kieker::common::record::controlflow::OperationExecutionRecord->new($operationSignature, $sessionId, $traceId, $tin, $tout, $hostname, $eoi, $ess);
 
 $writer->write($record->genoutput());

=head1 DESCRIPTION

Auto-generated structures. See the IRL code.
		
=head1 METHODS

=head2 $record = kieker::common::record::controlflow::OperationExecutionRecord->new($operationSignature, $sessionId, $traceId, $tin, $tout, $hostname, $eoi, $ess);

Creates a new record with the given parameters.

=cut

sub new {
  my ($operationSignature, $sessionId, $traceId, $tin, $tout, $hostname, $eoi, $ess) = @_;
  my $this = {
    operationSignature => $operationSignature,
    sessionId => $sessionId,
    traceId => $traceId,
    tin => $tin,
    tout => $tout,
    hostname => $hostname,
    eoi => $eoi,
    ess => $ess
  };

  return bless($this,$type);
}

=head2 $string = $record->genoutput();

Serializes the record for output. Returns the serialized form of the record.
				
=head1 COPYRIGHT and LICENCE

Copyright 2013 Kieker Project (http://kieker-monitoring.net)

Licensed under the Apache License, Version 2.0 (the "License"); 
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

=cut
