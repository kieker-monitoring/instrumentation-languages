#include "kieker_lookup.h"

#include <stdio.h>


/* --- internal functions */
/* Note: this is an simple ineffective reverse lookup of keys by values */
char** kieker_lookup_string_list = NULL;
long int kieker_lookup_table_max = 0;
long int kieker_lookup_table_top = 0;

#define KIEKER_LOOKUP_STRING_BUF_SIZE 65535
#define KIEKER_LOOKUP_TABLE_INC 1024

long int kieker_lookup_find_key_by_string(const char* string);
void kieker_lookup_string_list_add_value(const char* string);

/**
 * Reads in the lookup table and returns the number of read lines on success else -1.
 */
int kieker_lookup_create(const char *filename) {
	FILE *fc; // configuration file
	int lcount = 0; // number of lines processed
	if ((fc=fopen(filename,"r"))!=NULL) {
		char *string = malloc(KIEKER_LOOKUP_STRING_BUF_SIZE*sizeof(char));
		while (fgets(string,KIEKER_LOOKUP_STRING_BUF_SIZE,fc)!=NULL) {
			kieker_lookup_string_list_add_value(string);
			lcount++;
		}
		return lcount;
	} else {
		return -1;
	}
}

/**
 * Reverse lookup.
 */
long int kieker_lookup_find_key_by_string(const char* string) {
	int i;
	for (i=0;i<kieker_lookup_table_top;i++) {
		if (strcmp(kieker_lookup_string_list[i],string)==0)
			return i;
	}
	return -1;
}

/**
 *
 */
void kieker_lookup_string_list_add_value(const char* string) {
	if (kieker_lookup_table_top == kieker_lookup_table_max) {
		kieker_lookup_table_max+=KIEKER_LOOKUP_TABLE_INC;
		kieker_lookup_string_list = realloc (kieker_lookup_string_list, kieker_lookup_table_max*sizeof(const char*));
	}
	char * value = strncpy(malloc(strlen(string)),string,strlen(string)-1);
	value[strlen(string)-1]=0;
	kieker_lookup_string_list[kieker_lookup_table_top++]=value;
}
