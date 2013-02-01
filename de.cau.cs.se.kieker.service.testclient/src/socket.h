#ifndef SOCKET
#define SOCKET
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


unsigned short socket_open_read (unsigned short port);
int socket_open_write (const char* host, unsigned short port);

int socket_close (unsigned short socket);

int socket_send (unsigned short socket, char *string);
char* socket_recv (unsigned short socket);

#endif

