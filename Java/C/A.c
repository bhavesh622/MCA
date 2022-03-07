#include<sys/types.h>
#include<sys/wait.h> 
#include<stdio.h>
#include<unistd.h>
#include<stdlib.h>

int main() {  
    pid_t pid; 
    int i; 
    pid = fork(); 
    if (pid == 0) {  
        printf("\nChild Process executing B.c: ");
        execl("./B", "X", NULL); 
    } 
    else { 
        wait(NULL);
        printf("\n I am parent.");
    } 
    printf("\nBye from Parent!");
    return(0);
} 
