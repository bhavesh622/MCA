#include<iostream>
#include<stack>
#include<stdlib.h>
#include<unistd.h>
#include<limits.h>
#include<stdio.h>
#include<stdlib.h>
#include<queue>

using namespace std;
struct _node{
 	int name;
	int weight;
	struct _node* next;
};

typedef struct _node Node;

struct _list{

	Node *head;
};

typedef struct _list List;

struct _graph{
	int v;
	List *array;
};
typedef struct _graph Graph;
Graph *graph;

Node* newNode(int v, int weight)
{
	Node* node = (Node*)malloc(sizeof(Node));
	node -> name = v;
	node -> weight = weight;
	node -> next = NULL;
	return node;
}
void initGraph(int v)
{
graph = (Graph*) malloc(sizeof(Graph));
graph -> v = v;
graph -> array = (List*)calloc(v, sizeof(List));

for(int i = 0;i < v; i++)
graph -> array[i].head = NULL;
}
void insertEdge(int u, int v, int weight)
{
List *list = &graph -> array[u];

Node* node = newNode(v, weight);
node -> next = list->head;
list->head = node;

list = &graph -> array[v];
node = newNode(u, weight);
node -> next = list->head;
list->head = node;

}

int minDistanceFringe(char status[], int distance[], int n){

	int index = -1;
	int mini = INT_MAX;

	for(int i = 0; i < n; i++){
		if(status[i] == 'F' && distance[i] < mini){
			index = i;
			mini = distance[i];
		}
	}
return index;
}
void printPath(int s, int d, int parent[]){

if(s == d)
	printf("%d ", s);
else{
	printPath(s, parent[d], parent);
	printf("%d ", d);
}
}
void dijkstra(int s, int d){

	char status[graph -> v]; //Unvisited, Fringe, Permanent
	int distance[graph -> v]; //minimum distance from source to vertex i
	int parent[graph -> v];//parent of node i

	for(int i = 0; i < graph -> v; i++)
	{
		status[i] = 'U';
		distance[i] = INT_MAX;
	}

	status[s] = 'T';
	distance[s] = 0;
	parent[s] = s;
	
	int current = s;
	
	while(current != d)
	{

		Node* start = graph -> array[current].head;

for(Node* adj = start; adj != NULL; adj = adj -> next){

if(status[adj -> name] == 'F' && distance[current] + adj -> weight < distance[adj -> name]){
distance[adj -> name] = distance[current] + adj -> weight;
parent[adj -> name] = current;
}else if(status[adj -> name] == 'U'){

status[adj -> name] = 'F';
parent[adj -> name] = current;
distance[adj -> name] = distance[current] + adj -> weight;
}
}

int nextmini = minDistanceFringe(status, distance, graph -> v);
	if(nextmini != -1){
		status[nextmini] = 'T';
		current = nextmini;
	}else
	break;
}
printPath(s, d, parent);
}
void print()
{
	for(int i = 0; i < graph -> v; i++){
		List list = graph -> array[i];
		printf("[%d] -> ", i);
	for(Node* current = list.head;current != NULL; current = current -> next)
	printf("%d -> ", current -> name);
	printf("\n");
	}
}

int main()
{
initGraph(6);
insertEdge(1, 0, 3);
insertEdge(0, 2, 9);
insertEdge(1, 4, 11);
insertEdge(1, 2, 8);
insertEdge(1, 3, 9);
insertEdge(2, 5, 2);
insertEdge(2, 3, 1);
insertEdge(3, 5, 9);
insertEdge(3, 4, 6);
insertEdge(4, 5, 7);

print();
printf("\n");
printf("Shortest path from 0 to 4 is : ");
dijkstra(0, 4);
printf("\n");
}
