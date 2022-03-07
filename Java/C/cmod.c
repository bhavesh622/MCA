#include <stdio.h>
#include <stdlib.h>
#include <sys/stat.h>
#include<fcntl.h> 
#include<unistd.h> 

int main(){
    int fd;
    fd=open("Chmod.txt",O_CREAT | O_RDWR,0755);
    printf("Changed permission using chmod\n");
    chmod("Chmod.txt",S_IRWXG);
}
