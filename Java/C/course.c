#include<stdio.h> 
#include<fcntl.h> 
#include<unistd.h> 
#include<sys/stat.h> 
#include<stdlib.h> 
#include<sys/wait.h> 
int main(){
    pid_t pid1 ,pid2, pid3; 
    pid1=fork();
    int fd=open ("courses.txt", O_RDONLY);
    char line[200];
    if (pid1 == 0){
            printf("Reading 1st line from courses.txt \n");
            read(fd,line,16);
            for(int i=0;i<17;i++){
                printf("%c",line[i]);
            }
            printf("\n"); 
            close(fd);
        }
    else{
            pid2=fork();
            if (pid2 == 0){
                fd=open ("courses.txt", O_RDONLY);
                printf("Reading 2nd line from courses.txt \n");
                read(fd,line,34);
                for(int i=17;i<34;i++){
                    printf("%c",line[i]);
                }
                printf("\n"); 
                close(fd);
            }
            else{
                pid3=fork();
                if (pid3 == 0){
                    fd=open ("courses.txt", O_RDONLY);
                    printf("Reading 3rd line from courses.txt \n");
                    read(fd,line,52);
                    for(int i=34;i<52;i++){
                        printf("%c",line[i]);
                    }
                    printf("\n"); 
                    close(fd);
                }
                    else{
                            waitpid(pid3,0,0);
                    }
            }
        }
}
