/*
 * Generic Header
 */

#ifndef KIEKER_SERIALIZE_H
#define KIEKER_SERIALIZE_H

/*
 * Serialize a boolean value coded in a char. true = 1 and false = 0
 *
 * buffer = the buffer to send the data
 * offset = store data to buffer at offset
 * value = the value to be stored
 *
 * returns size of written structure
 */
int kieker_serialize_boolean (char *buffer, const int offset, const char value);

/*
 * Serialize a character value, which we assume is an 8 bit wide integer-
 *
 * buffer = the buffer to send the data
 * offset = store data to buffer at offset
 * value = the value to be stored
 *
 * returns size of written structure
 */
int kieker_serialize_int8 (char *buffer, const int offset, const char value);

/*
 * buffer = the buffer to send the data
 * offset = store data to buffer at offset
 * value = the value to be stored
 *
 * returns size of written structure
 */
int kieker_serialize_int16 (char *buffer, const int offset, const short int value);

/*
 * buffer = the buffer to send the data
 * offset = store data to buffer at offset
 * value = the value to be stored
 *
 * returns size of written structure
 */
int kieker_serialize_int32 (char *buffer, const int offset, const long int value);

/*
 * buffer = the buffer to send the data
 * offset = store data to buffer at offset
 * value = the value to be stored
 *
 * returns size of written structure
 */
int kieker_serialize_int64 (char *buffer, const int offset, const long long value);
/*
 * buffer = the buffer to send the data
 * offset = store string data to buffer at offset
 * string = the string to be stored
 *
 * returns size of written structure
 */
int kieker_serialize_string (char *buffer, int offset, const char *string);

#endif
