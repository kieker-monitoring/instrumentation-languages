#include "operation_execution_record.h"
#include "../binary_serializer.h"

/*
 * Serialize an OperationExecutionRecord and return the size of the written structure.
 *
 * buffer = the buffer to send the data
 * id = id to identify the record type
 * offset = store data to buffer at offset
 * value = the value to be stored
 *
 * returns size of written structure
 */
int operation_execution_record_serialize(char *buffer, const int id, const int offset, const OperationExecutionRecord value) {
	int length = 0;
	length += serialize_int32(buffer,offset,id);
	length += serialize_string(buffer,offset + length,value.operationSignature);
	length += serialize_string(buffer,offset + length,value.sessionId);
	length += serialize_int64(buffer,offset + length,value.traceId);
	length += serialize_int64(buffer,offset + length,value.tin);
	length += serialize_int64(buffer,offset + length,value.tout);
	length += serialize_string(buffer,offset + length,value.hostname);
	length += serialize_int32(buffer,offset + length,value.eoi);
	length += serialize_int32(buffer,offset + length,value.ess);

	return length;
}
