# I am a comment, and I want to say that the variable CC will be
# the compiler to use.
CC=gcc
# Hey!, I am comment number 2. I want to say that CFLAGS will be the
# options I'll pass to the compiler.
CFLAGS=-c -Wall -std=c99

all: socket.o testclient.o link

.c.o:
	gcc $(CFLAGS) -I. -I.. $<

clean:
	rm -f *.o testclient

link:
	gcc socket.o testclient.o -o testclient


	