/***************************************************************************
 * Copyright 2013 by
 *  + Christian-Albrechts-University of Kiel
 *    + Department of Computer Science
 *      + Software Engineering Group
 *  and others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ***************************************************************************/
#include "kieker_serialize.h"
#include <string.h>
#include <byteswap.h>
#include <stdlib.h>

/*
 * Serialize a boolean value coded in a char. true = 1 and false = 0
 *
 * buffer = the buffer to send the data
 * offset = store data to buffer at offset
 * value = the value to be stored
 *
 * returns size of written structure
 */
int kieker_serialize_boolean (char *buffer, const int offset, const char value) {
	memcpy(buffer+offset,&value,1);
	return 1;
}

/*
 * Serialize a character value, which we assume is an 8 bit wide integer-
 *
 * buffer = the buffer to send the data
 * offset = store data to buffer at offset
 * value = the value to be stored
 *
 * returns size of written structure
 */
int kieker_serialize_int8 (char *buffer, const int offset, const char value) {
	memcpy(buffer+offset,&value,1);
	return 1;
}

/*
 * buffer = the buffer to send the data
 * offset = store data to buffer at offset
 * value = the value to be stored
 *
 * returns size of written structure
 */
int kieker_serialize_int16 (char *buffer, const int offset, const short int value) {
	short int nvalue = htons(value);
	memcpy(buffer+offset,&nvalue,2);
	return 2;
}

/*
 * buffer = the buffer to send the data
 * offset = store data to buffer at offset
 * value = the value to be stored
 *
 * returns size of written structure
 */
int kieker_serialize_int32 (char *buffer, const int offset, const long int value) {
	long int nvalue = htonl(value);
	memcpy(buffer+offset,&nvalue,4);
	return 4;
}

/*
 * buffer = the buffer to send the data
 * offset = store data to buffer at offset
 * value = the value to be stored
 *
 * returns size of written structure
 */
int kieker_serialize_int64 (char *buffer, const int offset, const long long value) {
	// TODO this is not cross-platform bswap_64 might not be available
	long long nvalue = bswap_64(value);
	memcpy(buffer+offset,&nvalue,8);
	return 8;
}

/*
 * buffer = the buffer to send the data
 * offset = store string data to buffer at offset
 * string = the string to be stored
 *
 * returns size of written structure
 */
int kieker_serialize_string (char *buffer, int offset, const char *string) {
	long int nvalue = htonl(kieker_lookup_find_key_by_string(string));
	memcpy(buffer+offset,&nvalue,4);
	return 4;

	return 4;
}
