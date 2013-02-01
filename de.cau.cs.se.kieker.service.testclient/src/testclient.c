/*
 * testclient.c
 *
 *  Created on: 31 Jan 2013
 *      Author: rju
 */
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <netdb.h>
#include <time.h>
#include <sys/time.h>
#include "socket.h"

#include <endian.h>
#include <byteswap.h>

#define BUFSIZE 1024

int port = 9000;
char *hostname = "localhost";

typedef struct sOperationExecutionRecord {
	char *operationSignature;
	char *sessionId;
	long long traceId;
	long long tin;
	long long tout;
	char *hostname;
	long int eoi;
	long int ess;
} OperationExecutionRecord;

/* function header */
void error(const char *message);
void send_data(int sockfd);
int serialize_string (char *buffer, int offset, const char *string);
int serialize_int32 (char *buffer, int offset, long int value);
int serialize_int64 (char *buffer, int offset, long long value);

/*
 * main routinge
 */
int main(int argc, char *argv[]) {
    int sockfd;

    fprintf(stdout,"testclient v0.1\n");
    if ((sockfd = socket_open_write (hostname, port))>0) {
    	send_data(sockfd);
    	socket_close (sockfd);
    	exit(0);
    } else {
    	error("Error opening socket.");
    }

}

void error(const char *message) {
	fprintf(stderr,"%s\n", message);
	exit(1);
}

void send_data(int sockfd) {
	OperationExecutionRecord dummy;
    char buffer[BUFSIZE];
    int n;
	struct timeval tv;
	gettimeofday(&tv, NULL);

	/* prepare test data */
	dummy.operationSignature = "example op";
	dummy.sessionId = "1";
	dummy.traceId = 1;
	dummy.hostname = "localhost";
	dummy.eoi = -1;
	dummy.ess = -1;
	dummy.tin = tv.tv_sec * 1000000ULL + tv.tv_usec;
	dummy.tout = tv.tv_sec * 1000000ULL + tv.tv_usec;

	/* connect to client */
	for (int i=0; i<1000000;i++) {
		/* measure */
/*		struct timeval tv;
		gettimeofday(&tv, NULL);
		dummy.tin = tv.tv_sec * 1000000ULL + tv.tv_usec;
		int delay = random()/(RAND_MAX/100);
		fprintf(stderr,"Out %d, delay %d\r",i,delay);
		usleep(delay);
		gettimeofday(&tv, NULL);
		dummy.tout = tv.tv_sec * 1000000ULL + tv.tv_usec;
*/
		/* serialize */
		int offset = 0;
		offset += serialize_int32(buffer,offset,10); /* say: I am an OperationExecutionRecord */
		offset += serialize_string(buffer,offset,dummy.operationSignature);
		offset += serialize_string(buffer,offset,dummy.sessionId);
		offset += serialize_int64(buffer,offset,dummy.traceId);
		offset += serialize_int64(buffer,offset,dummy.tin);
		offset += serialize_int64(buffer,offset,dummy.tout);
		offset += serialize_string(buffer,offset,dummy.hostname);
		offset += serialize_int32(buffer,offset,dummy.eoi);
		offset += serialize_int32(buffer,offset,dummy.ess);
		/* send and measure */
		gettimeofday(&tv, NULL);
		dummy.tin = tv.tv_sec * 1000000ULL + tv.tv_usec;
		n = write(sockfd, buffer, offset);
		gettimeofday(&tv, NULL);
		dummy.tout = tv.tv_sec * 1000000ULL + tv.tv_usec;
		if (n < 0)
			error("ERROR writing to socket");
	}
}


/*
 * buffer = the buffer to send the data
 * offset = store string data to buffer at offset
 * string = the string to be stored
 *
 * returns size of written structure
 */
int serialize_string (char *buffer, int offset, const char *string) {
	int len = strlen(string);
	offset += serialize_int32(buffer,offset,len);
	memcpy(buffer+offset,string,len);

	return len+4;
}

/*
 * buffer = the buffer to send the data
 * offset = store data to buffer at offset
 * value = the value to be stored
 *
 * returns size of written structure
 */
int serialize_int32 (char *buffer, int offset, long int value) {
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
int serialize_int64 (char *buffer, int offset, long long value) {
	long long nvalue = bswap_64(value);
	memcpy(buffer+offset,&nvalue,8);
	return 8;
}

