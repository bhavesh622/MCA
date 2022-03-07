#include<stdio.h>
#include<unistd.h> 
#include<fcntl.h>
#include<stdlib.h>
#include<sys/types.h> 

void main()
{ 
  int n;
  printf("\nInput n:"); 
  scanf("%d",&n);
  for(int i=1; i<n; i++){
    int flag=0;
    for(int j=2; j<=sqrt(i); j++){
        if(i%j==0){
            flag=1; 
            break;
        }
    }
    if(i==1){
        printf("\n1 is not prime, not composite.\n");
    }
    else{
        if(flag==0){
            printf("%d is prime.\n",i);
        }
    }
  }
}
