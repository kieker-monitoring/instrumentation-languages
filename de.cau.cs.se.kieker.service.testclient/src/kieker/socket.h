#ifndef SOCKET_H
#define SOCKET_H
#include <stdlib.h>
#include <strings.h>
#include <sys/types.h>		/* contains definition of size_t */
#include <sys/socket.h>

#include <arpa/inet.h>   /* defines: type in_addr, protocols: TCP,UDP...  */
                          /* macro: INADDR_ANY, INADDR_BROADCAST,          */
			  /*        INADDR_NONE, INADDR_LOOPBACK...        */
                          /* functions: htonl, ntohl, htons, ntohs         */

#include <netdb.h>        /* define: type struc hostent, servent, protoent */
			  /* functions: gethostbyname, getprotobyname,     */
			  /*            getservbyname, gethostbyaddr,      */
			  /*            etc...*/
#include <unistd.h>
#include <signal.h>
#include <syslog.h>

/*
 * Open a server socket and return the socket handle.
 *
 * port = the port number for the service.
 *
 * return socket handle id or -1 on error.
 */
unsigned short socket_open_read (unsigned short port);

/*
 * Open a client socket, by connecting to a remote service and return the socket handle.
 *
 * port = the port number of the service.
 * host = FQN of the host
 *
 * returns the socket for the connection or
 *         -1 or h_errno negative numbers on error
 */
int socket_open_write (const char* host, unsigned short port);

/*
 * Close a previously opened socket connection.
 *
 * socket = the socket to be closed
 *
 * returns the result of close (man 2 close)
 */
int socket_close (unsigned short socket);

#endif

