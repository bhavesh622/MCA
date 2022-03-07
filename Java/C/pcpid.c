#include<stdio.h> 
#include<fcntl.h> 
#include<stdlib.h> 
#include<unistd.h> 
#include<sys/types.h> 
#include<sys/stat.h> 
#include<sys/wait.h> 

int main(){
   pid_t pid; 
   pid=fork(); 
   if(pid==0){
       printf("\nInside Child");
       printf("\nChild Process Id:%d",getpid()); 
       printf("\nClosing Child");
       exit(0);
    }
    else{
        wait(NULL);
        printf("\nIn Parent Process:-"); 
        printf("\nParent Process ID: %d",getpid()); 
        printf("\nParent's Child ID: %d",pid); 
        printf("\nClosing Parent");
    }
printf("\n"); 
return 0;
}
