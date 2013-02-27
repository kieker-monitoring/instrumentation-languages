#include "socket.h"
#include <stdio.h>
#include <stdlib.h>
#include <errno.h>
#include <string.h>
#include <netdb.h>

/*
 * Open a server socket and return the socket handle.
 *
 * port = the port number for the service.
 *
 * return socket handle id or -1 on error.
 */
unsigned short socket_open_read (unsigned short port)
{
  struct sockaddr_in name;      /* an internet endpoint address */
  int s;			/* socket descriptor */

  /* allocate a socket */
  if ( (s = socket(PF_INET, SOCK_STREAM, 0))<0)
    return -1;

  /* bind */
  name.sin_family = AF_INET;
  if (port==0)
    name.sin_addr.s_addr=htonl(INADDR_NONE);
  else {
    name.sin_port=htons(port);
    name.sin_addr.s_addr=htonl(INADDR_ANY);
  }
  if (bind(s,(struct sockaddr *)&name,sizeof(name))<0)
    return -1;

  /* use listen to queue requests */
  if (listen(s,1)==-1)
    return -1;

  return s;
}

/*
 * Open a client socket, by connecting to a remote service and return the socket handle.
 *
 * port = the port number of the service.
 * host = FQN of the host
 *
 * returns the socket for the connection or
 *         -1 or h_errno negative numbers on error
 */
int socket_open_write (const char* host, unsigned short port)
{
  struct hostent *hostinfo;     /* pointer to name resolution table entry */
  struct sockaddr_in name;      /* an internet endpoint address           */
  int s;			/* socket descriptor(similar to file desc)*/
  int i;
  
  /* allocate a socket */
  if ((s = socket(PF_INET, SOCK_STREAM, 0)) < 0)
    return -1;
  
  name.sin_family = AF_INET;
  name.sin_port=htons(port);

  /* map host name to IP address */
  if ((hostinfo=gethostbyname(host))==NULL) {
	  fprintf (stderr,"Host '%s' could not be found\n",host);
    return h_errno;
  }

  name.sin_addr=*(struct in_addr *)hostinfo->h_addr_list[0];
  
  /* connect the socket */
  if ( connect(s,(struct sockaddr *)&name,sizeof(struct sockaddr_in)) < 0) {
    i=-1;
    fprintf (stderr,"[%d] %s\n",i,strerror(i));
    return -1;
  }

  /* everything is ok. return socket */
  return s;
}

/*
 * Close a previously opened socket connection.
 *
 * socket = the socket to be closed
 *
 * returns the result of close (man 2 close)
 */
int socket_close (unsigned short socket)
{
  struct linger ling;

  ling.l_onoff=1;  /* close will wait until all data is 
		      transmitted or the timeout period has expired */
  ling.l_linger=0; /* sets that timeout to 0 seconed */
  setsockopt(socket,SOL_SOCKET,SO_LINGER,&ling,sizeof(ling));
  return close(socket);
}







