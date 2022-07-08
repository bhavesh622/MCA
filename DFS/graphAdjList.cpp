#include<stdio.h>
#include<stdlib.h>
#include<queue>
#include<iostream>
#include<stack>

using namespace std;
struct _node{
	
	int name;
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

Node* newNode(int v)
{
	Node* node = (Node*)malloc(sizeof(Node));
	node -> name = v;
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
void insertEdge(int u, int v)
{
	List *list = &graph -> array[u];

	Node* node = newNode(v);
	node -> next = list->head;
	list->head = node;

	list = &graph -> array[v];
	node = newNode(u);
	node -> next = list->head;
	list->head = node;

}

void bfs(int src)
{
	queue<int> q;
	char table[graph -> v];
	
	for(int i = 0; i < graph -> v; i++)
		table[i] = 'W';

	q.push(src);
	table[src] = 'G';

	while( !q.empty() ){
		
		int item = q.front();
		q.pop();
		table[item] = 'B';
		printf("%d ", item);		
		
		for(Node *current = graph -> array[item].head; current != NULL; current = current -> next)
		{
			if( table[current -> name] == 'W')
			{
				table[current -> name] = 'G';
				q.push(current -> name);			
			}
		}		
			
	}
}

void dfs(int src)
{
	stack<int> s;
	char table[graph -> v];
	
	for(int i = 0; i < graph -> v; i++)
		table[i] = 'W';
	
	table[src] = 'G';
	s.push(src);
	while(! s.empty())
	{
		Node* current = graph -> array[src].head;
		
		while(current)
		{
			if( table[current -> name] == 'W'){
				s.push(current -> name);
				table[current -> name] = 'G';
				current = graph -> array[s.top()].head;
			}else{
				current = current -> next;
			}
		}
		src = s.top();
		s.pop();
		table[src] = 'B';
		printf("%d ", src);
		
	}
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
	insertEdge(1, 0);
	insertEdge(0, 2);
	insertEdge(1, 2);
	insertEdge(2, 3);
	insertEdge(2, 4);
	insertEdge(2, 5);
	insertEdge(3, 5);
	insertEdge(4, 5);
	
	print();
	

	printf("\n");
	bfs(0);
	printf("\n");
	dfs(0);
	printf("\n");
	//print();
}











