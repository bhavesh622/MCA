#include<stdio.h>
#include<stdlib.h>
int main(){
	int i, n, *ptr;
	printf("Input the array size: ");
	fflush(stdout);
	scanf("%d",&n);
	ptr = (int*)malloc(n*sizeof(int));
	if(ptr==NULL){
		printf("\nNo allocation of memory");
	}
	else{
		printf("\nMemory allocation successful thru malloc");
		printf("\nAddress of first byte =%p", ptr);
		for(i=0;i<n;i++){
			ptr[i] = i+10;
		}
	}
	printf("\nArray Elements: \n");
	for(i=0; i<n; i++){
		printf("%d ", ptr[i]);
	}
    return 0;
}
