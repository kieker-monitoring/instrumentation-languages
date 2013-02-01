#include "socket.h"
#include <stdio.h>
#include <stdlib.h>
#include <errno.h>
#include <string.h>
#include <netdb.h>

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

int socket_close (unsigned short socket)
{
  struct linger ling;

  ling.l_onoff=1;  /* close will wait until all data is 
		      transmitted or the timeout period has expired */
  ling.l_linger=0; /* sets that timeout to 0 seconed */
  setsockopt(socket,SOL_SOCKET,SO_LINGER,&ling,sizeof(ling));
  return close(socket);
}

int socket_send (unsigned short socket, char *string)
{
  if (socket!=0) {
    if (send (socket,string,strlen(string),0)==-1) {
      return -1;
    } else {
      return 0;
    }
  } else {
    return -2;
  }
}

char* socket_recv (unsigned short socket)
{
  static char line[102];
  char *pos;
  int size,lsize;

  size=0;
  pos=line;
  do {
    lsize=recv (socket,pos,1,0);
    if (lsize==0) { /* no data */
      return NULL;
    }
    pos+=lsize;
    size+=lsize;
  } while ((size<100) &&
	   (line[size-1]!='\n'));
  line[size]=0;

  return line;
}






