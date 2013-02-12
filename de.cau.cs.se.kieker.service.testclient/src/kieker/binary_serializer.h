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

#ifndef BINARY_SERIALIZER_H
#define BINARY_SERIALIZER_H

/* Note: the data ranges and sizes for C types are not necessarily as defined below.
 * For example, an character might have other width than 8bit. A better cross-platform
 * implementation should be addressed.
 */

/*
 * Serialize a boolean value coded in a char. true = 1 and false = 0
 *
 * buffer = the buffer to send the data
 * offset = store data to buffer at offset
 * value = the value to be stored
 *
 * returns size of written structure
 */
int serialize_boolean (char *buffer, const int offset, const char value);

/*
 * Serialize a character value, which we assume is an 8 bit wide integer-
 *
 * buffer = the buffer to send the data
 * offset = store data to buffer at offset
 * value = the value to be stored
 *
 * returns size of written structure
 */
int serialize_int8 (char *buffer, const int offset, const char value);

/*
 * buffer = the buffer to send the data
 * offset = store data to buffer at offset
 * value = the value to be stored
 *
 * returns size of written structure
 */
int serialize_int16 (char *buffer, const int offset, const short int value);

/*
 * buffer = the buffer to send the data
 * offset = store data to buffer at offset
 * value = the value to be stored
 *
 * returns size of written structure
 */
int serialize_int32 (char *buffer, const int offset, const long int value);

/*
 * buffer = the buffer to send the data
 * offset = store data to buffer at offset
 * value = the value to be stored
 *
 * returns size of written structure
 */
int serialize_int64 (char *buffer, const int offset, const long long value);

/*
 * buffer = the buffer to send the data
 * offset = store string data to buffer at offset
 * string = the string to be stored
 *
 * returns size of written structure
 */
int serialize_string (char *buffer, int offset, const char *string);

#endif
