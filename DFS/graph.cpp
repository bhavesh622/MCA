#include<stdlib.h>
#include<stdio.h>

int G[100][100];
int n;

void initializeGraph(int num)
{
	n = num;
	
	for(int i = 0; i < n; i++)
		for(int j = 0; j < n; j++)
			G[i][j] = 0;			
}

void addVertex()
{	
	for(int i = 0; i < n; i++)
		G[i][n] = G[n][i] = 0;
	n++;
}

void addEdge(int u, int v){
	
	if (u >= n || v >= n)
		printf("Error: Invalid edge\n");
	else
		G[u][v] = G[v][u] = 1;
}
void deleteVertex(){
	n--;
}
void deleteEdge(int u, int v){
	if (u >= n || v >= n)
		printf("Error: Invalid edge\n");
	else
		G[u][v] = G[v][u] = 0;
	
}
void display(){
	
	for(int i = 0; i < n; i++)
	{
		for(int j = 0; j < n; j++)
			printf("%d  ", G[i][j]);
		printf("\n");
	}
	printf("\n");
}
int main()
{
	
	printf("1. Initialize graph\n");
	printf("2. Add vertex\n");
	printf("3. Add edge\n");
	printf("4. Delete vertex\n");
	printf("5. Delete edge\n");
	printf("6. Display Graph\n");
	printf()
	printf("0 to exit\n");
	int choice, v;
	
	do{
	printf("Input choice: ");
	scanf("%d", &choice);
	switch(choice){
		
		case 1: {
			printf("Input number of vertices: ");
			scanf("%d", &v);
			initializeGraph(v);
			break;
		}
		case 2: {
			addVertex();
			break;
		}
		case 3: {
			int u, v;
			printf("Input u: "); scanf("%d", &u);
			printf("Input v: "); scanf("%d", &v);
			
			addEdge(u, v);
			break;
		}
		case 4: {
			deleteVertex();
			break;
		}
		case 5: {
			int u, v;
			printf("Input u: "); scanf("%d", &u);
			printf("Input v: "); scanf("%d", &v);
			
			deleteEdge(u, v);
			break;
			break;
		}
		case 6: {
			display();
			break;
		}
	}}while(choice != 0);
	
	return 0;
}










