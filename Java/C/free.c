#include<stdio.h>
#include<conio.h>
void main(){
	int i, n, *ptr1, ;
	clrscr();
	printf("Input the array size: ";
	scanf("");
	ptr1 = (int*)calloc(n,sizeof(int));
    ptr2 = (int*)malloc(n*sizeof((int));
	if(ptr1==NULL){
		printf("\nNo allocation of memory thru calloc");
        exit(0);
	} 
	else{
		printf("\nMemory allocation successful thru calloc");
		printf("\nAddress of first byte =%p", ptr);
	}
    if (pt2==NULL){
        printf("\nNo allocation of memory thru malloc");
        exit(0);
    }
    else{
		printf("\nMemory allocation successful thru malloc");
		printf("\nAddress of first byte =%p", ptr);
	}
    //Free calloc memory
    free(ptr1);
    printf("Calloc memory successfully freed.\n");

    // Free malloc memory
    free(ptr2);
    printf("Malloc Memory successfully freed.\n");
    }

    return 0;
}