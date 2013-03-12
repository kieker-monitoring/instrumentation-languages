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

#include <endian.h>
#include <byteswap.h>

#include "kieker/socket.h"
#include "kieker/records/operation_execution_record.h"

#define BUFSIZE 1024
#define OPERATION_EXECUTION_RECORD_TYPE_ID 10

int port = 9000;
char *hostname = "localhost";

/* function header */
void error(const char *message);
void send_data(int sockfd, int iterations);

/*
 * main routinge
 */
int main(int argc, char *argv[]) {
    int sockfd;
    int iterations;

    fprintf(stdout,"testclient v0.1\n");
    if ((sockfd = socket_open_write (hostname, port))>0) {
        if (argc>1)
		iterations=atoi(argv[1]);
    	send_data(sockfd,iterations);
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

void send_data(int sockfd, int iterations) {
	OperationExecutionRecord dummy;
    char buffer[BUFSIZE];
    int n;
	struct timeval tv;
	gettimeofday(&tv, NULL);

	/* prepare test data */
	dummy.operationSignature = "example op";
	dummy.sessionId = "1";
	dummy.traceId = 1;
	dummy.hostname = hostname;
	dummy.eoi = -1;
	dummy.ess = -1;
	dummy.tin = tv.tv_sec * 1000000ULL + tv.tv_usec;
	dummy.tout = tv.tv_sec * 1000000ULL + tv.tv_usec;

	/* connect to client */
	for (int i=0; i<iterations;i++) {
		/* measure some random delay function */
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
		int length = operation_execution_record_serialize(buffer,OPERATION_EXECUTION_RECORD_TYPE_ID,0,dummy);

		/* send and measure its own message send time conspuption */
		gettimeofday(&tv, NULL);
		dummy.tin = tv.tv_sec * 1000000ULL + tv.tv_usec;
		n = write(sockfd, buffer, length);
		gettimeofday(&tv, NULL);
		dummy.tout = tv.tv_sec * 1000000ULL + tv.tv_usec;
		if (n < 0)
			error("ERROR writing to socket");
	}
}

