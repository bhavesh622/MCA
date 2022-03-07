#include<stdio.h>
#include<conio.h>
void main(){
	int i, n, *ptr;
	clrscr();
	printf("Input the array size: ";
	scanf("");
	ptr = (int*)calloc(n,sizeof(int));
	if(ptr==NULL){
		printf("\nNo allocation of memory");
	}
	else{
		printf("\nMemory allocation successful thru calloc");
		printf("\nAddress of first byte =%p", ptr);
		for(i=0;i<n;i++){
			ptr[i] = i+10;
		}
	}
	printf("\nArray Elements: \n");
	for(i=0; i<n; i++){
		printf("%d ", ptr[i]);
	}
    n = 15;
    printf("\n\nThe new size of the array is: %d\n", n);
 
    // Dynamically re-allocate memory using realloc()
    ptr = realloc(ptr, n * sizeof(int));
    printf("Memory successfully re-allocated using realloc.\n");
    for (i = 5; i < n; ++i) {
        ptr[i] = i + 1;
    }
    printf("The new elements of the array are: ");
    for (i = 0; i < n; ++i) {
        printf("%d, ", ptr[i]);
    }
    free(ptr);
    return 0;
}

