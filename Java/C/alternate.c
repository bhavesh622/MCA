#include<stdio.h>
#include<fcntl.h> 
#include<unistd.h> 
#include<sys/stat.h>

int main(){
    int n=26,index=0;
    int fd,sRead,sWrite;
    char read_value[n],write_value[n]; 
    for(int i=65;i<91;i++){ 
        write_value[index] = i; index++;
    }
    fd = open("alphabet.txt",O_CREAT | O_RDWR, 0777); 
    sWrite = write(fd, write_value, n);
    close(fd);
    fd = open("alphabet.txt",O_RDWR); 
    sRead = read(fd, read_value, n); 
    close(fd);
    for(int i=0;i<n;i+=2){ 
        printf("%c",read_value[i]);
    }
    printf("\n");
}
