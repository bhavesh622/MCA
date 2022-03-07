#include<stdio.h> 
#include<fcntl.h> 
#include<unistd.h> 
#include<sys/stat.h>

int main(){
    int inp,check,fd; unsigned int perm; char name[51] = "";
    printf("Select\n1.Create Directory\n2.Create File\n"); 
    scanf("%d", &inp);
    printf("Enter permission: "); 
    scanf("%o", &perm);
    switch(inp){
        case 1: printf("Enter directory name: "); 
                scanf("%50s", name);
                check = mkdir(name, perm); 
                if (!check) 
                    printf("Directory created\n");
                else
                    printf("Unable to create directory\n");
                break; 
        case 2: printf("Enter file name: "); 
                scanf("%50s", name);
                fd = open(name,O_CREAT | O_RDWR, perm); 
                printf("File created\n");
                close(fd);
                break;
    }
}
