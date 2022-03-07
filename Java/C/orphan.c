#include<stdio.h>
#include <sys/types.h>
#include <unistd.h>
int main(){
    // Creating child process 
    int pid = fork();
  
    if (pid > 0)
        printf("in parent process");

    else if (pid == 0){
        sleep(25);
        printf("in child process");
    }
    return 0;
}
