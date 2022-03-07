#include <stdlib.h>
#include <sys/types.h>
#include <unistd.h>
#include<stdio.h>
int main(){
    pid_t child_pid = fork();
    // Parent process 
    if (child_pid > 0)
        sleep(30));
    // Child process
    else        
        exit(0);
    printf("Woke up after 30 seconds");
    return 0;
}