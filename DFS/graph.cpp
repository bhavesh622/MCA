#include<stdlib.h>
#include<climits>
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
int degree(int v){
	int d = 0;
	for(int i = 0; i < n; i++)
	d += G[v][i];
	return d;
}
int degree(){
	int d = INT_MIN;
	for(int i = 0; i < n; i++)
	{
		int deg = degree(i);
		d = d > deg ? d : deg;
	}
	return d;
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
	printf("7. Degree of vertex\n");
	printf("8. Degree of graph\n");
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
		case 7:{
			int v;
			printf("Input vertex: ");
			scanf("%d", &v);
			printf("Degree is: %d\n", degree(v));
			break;
		}
		case 8:{
			int v;
			printf("Degree of graph is: %d\n", degree());
			break;
		}

	}}while(choice != 0);
	
	return 0;
}










