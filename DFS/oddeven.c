#include<stdlib.h>
#include<time.h>
#include<stdio.h>
void printFile(FILE *fptr){

	fseek(fptr, 0, SEEK_SET);
	char buffer[40];
	while(fscanf(fptr, "%s ", buffer) == 1)
	{
		printf("%s ", buffer);
	}
	printf("\n");
}
int main(){

	FILE *all;
	all = fopen("all.txt", "w+");

	int n = 30;
	srand(time(0));
	for(int i = 0; i < n; i++)
		fprintf(all, "%d ", rand()%100);
	fseek(all, 0, SEEK_SET);
	char buffer[40];
	FILE *even = fopen("even.txt", "w+");
	FILE *odd = fopen("odd.txt", "w+");
	while(fscanf(all, "%s ", buffer) == 1)
	{
		int num = atoi(buffer);
		if(num % 2 == 0)
			fprintf(even, "%d ", num);
		else
			fprintf(odd, "%d ", num);
	}

	printf("Content of ALL.txt: ");
	printFile(all);

	printf("Content of EVEN.txt: ");
	printFile(even);

	printf("Content of ODD.txt: ");
	printFile(odd);
	
	fclose(all);
	fclose(even);
	fclose(odd);
	return 0;
}

