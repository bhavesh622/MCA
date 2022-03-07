#define _POSIX_SOURCE
#include <fcntl.h>
#include <sys/stat.h>
#include <unistd.h>
#undef _POSIX_SOURCE
#include <stdio.h>

main(){
int fd;
mode_t old;
printf("Old mask in: %i\n", old=umask(S_IRWXG));
if((fd = creat("new.txt", S_IRWXU|S_IRWXG)) < 0){
	perror("creat() error");
}
else{
	system("ls -l new.txt");
	close(fd);
	unlink("new.txt");
}
umask(old);
}
