#include<stdio.h> 
#include<fcntl.h> 
#include<unistd.h> 
#include<sys/stat.h> 
#include<string.h>

int main(){
    int n;
    int fd, sRead, sWrite;
    printf("Enter number of student: "); 
    scanf("%d", &n);
    char write_value[n][61], read_value[n][61];
    for(int i=0;i<n;i++){
        printf("Enter student name,rollno: "); 
        scanf("%60s", write_value[i]);
    }
    fd = open("Student.txt",O_CREAT | O_RDWR, 0777); 
    for(int i=0;i<n;i++){
        sWrite = write(fd, write_value[i], 60);
    }
    close(fd);
    fd = open("Student.txt",O_RDWR); 
    for(int i=0;i<n;i++){
        sRead = read(fd, read_value[i], 60);
    }   
    printf("Student data: \n"); 
    for(int i=0;i<n;i++){
        printf("%s",read_value[i]); printf("\n");
    }
    printf("\nFile Existance = %d" , access("Student.txt", F_OK)); 
    printf("\nFile Read = %d", access("Student.txt", R_OK)); 
    printf("\nFile Write = %d", access("Student.txt", W_OK)); 
    printf("\nFile Execute = %d\n", access("Student.txt", X_OK));
}