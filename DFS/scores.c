#include<stdlib.h>
#include<string.h>
#include<limits.h>
#include<stdio.h>
void sort(float grades[20], char names[20][20], int n){

	int j;
	for(int i = 0; i < n-1; i++){

		for(j = 0; j < (n - i - 1); j++){

			if(grades[j] < grades[j+1])
			{
			float tmp = grades[j];
			grades[j] = grades[j+1];
			grades[j+1] = tmp;

			char name[20];
			strcpy(name, names[j]);
			strcpy(names[j], names[j+1]);
			strcpy(names[j+1], name);
			}
	}
	}
}
int main()
{

	FILE *fptr = fopen("grades.txt", "r");

	float grades[20];
	char names[20][20];

	int n = 0;
	char buffer[40];
	while(fscanf(fptr, "%s", buffer) == 1){
		grades[n] = atof(buffer);
		fscanf(fptr, "%s", names[n]);
		n++;
	}
	sort(grades, names, n);
	for(int i = 0; i < n; i++)
		printf("%s %0.2f\n", names[i], grades[i]);

	float first = INT_MIN;
	float second = INT_MIN;
	float third = INT_MIN;

	for(int i = 0; i < n; i++){
		if(grades[i] >= first)
			first = grades[i];  
		else if(grades[i] >= second)
			second = grades[i];
		else if(grades[i] >= third)
			third = grades[i];
		else
			break;
	}
	printf("Student got First Position are: ");
	for(int i = 0; i < n; i++){
		if(grades[i] == first)
			printf("%s ,", names[i]);
	}
	printf("\nStudents got Third position are: ");
	for(int i = 0; i < n; i++){
		if(grades[i] == third)
			printf("%s ", names[i]);
	}
	printf("\n");
fclose(fptr);
}
