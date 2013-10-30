/*
 ============================================================================
 Name        : exampleProgram.c
 Author      : Reiner Jung
 Version     :
 Copyright   : Kieker Project
 Description : Uses shared library to print greeting
               To run the resulting executable the LD_LIBRARY_PATH must be
               set to ${project_loc}/libkiekermon/.libs
               Alternatively, libtool creates a wrapper shell script in the
               build directory of this program which can be used to run it.
               Here the script will be called exampleProgram.
 ============================================================================
 */

#include "kieker.h"

int main(void) {

  return 0;
}
