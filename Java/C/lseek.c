#include <unistd.h>
#include <stdio.h> 
#include <fcntl.h>
#include <sys/types.h>
int main(){
        int file=0;
        if((file=open("String.txt",O_RDONLY)) < -1)
            return 1;
        char buffer[19];
        if(read(file,buffer,17) != 17)  
        return 1;
        printf("%s \n",buffer);
        if(lseek(file,10,SEEK_SET) < 0) 
        return 1;
        if(read(file,buffer,17) != 17)  
        return 1;
        printf("%s \n",buffer);
        return 0;
}
