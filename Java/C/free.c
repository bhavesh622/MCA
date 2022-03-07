#include<stdio.h>
#include<stdlib.h>
int main(){
	int i, n, *ptr1,*ptr2 ;
	printf("Input the array size: ");
	fflush(stdout);
	scanf("%d",&n);
	ptr1 = (int*)calloc(n,sizeof(int));
    	ptr2 = (int*)malloc(n*sizeof(int));
	if(ptr1==NULL){
		printf("\nNo allocation of memory thru calloc");
        exit(0);
	} 
	else{
		printf("\nMemory allocation successful thru calloc");
		printf("\nAddress of first byte =%p", ptr1);
	}
    if (ptr2==NULL){
        printf("\nNo allocation of memory thru malloc");
        exit(0);
    }
    else{
		printf("\nMemory allocation successful thru malloc");
		printf("\nAddress of first byte =%p", ptr2);
	}
    //Free calloc memory
    free(ptr1);
    printf("\nCalloc memory successfully freed.\n");

    // Free malloc memory
    free(ptr2);
    printf("Malloc Memory successfully freed.\n");

    return 0;
}
