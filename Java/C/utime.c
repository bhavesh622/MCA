#include <sys/types.h>          
#include <utime.h>              
#include <stdlib.h>             
#include <errno.h>              
#include <stdio.h>              

int main(int argc, char *argv[]) {
  int retV;
  struct utimbuf utimeStruct;
  if(argc != 2) {
    printf("ERROR: A file name is required as the single argument.\n");
    exit(1);
  } 
  utimeStruct.actime  = 0;
  utimeStruct.modtime = 0;
  if(utime(argv[1], &utimeStruct) != 0) { 
    printf("ERROR: utime failed with error number: %d\n", errno);
    exit(1);
  } 
}
