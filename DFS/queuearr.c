#include <stdio.h>
#include <malloc.h>
#include<stdio.h>
#define SIZE 5

int queue[SIZE], front = -1, rear = -1;

void enqueue(int item){
    if(rear == SIZE-1){
        printf("Queue is full\n");
    }
    else{
        if(front == -1){
            front = 0;
        }
        rear = rear + 1;
        queue[rear] = item;
        printf("Enqueued %d\n",item);
   }
}

void dequeue(){
    if(front == -1){
        printf("The queue is empty\n");
    }
    else{
        printf("Dequeued : %d\n", queue[front]);
        front = front + 1;

        if(front > rear){
	        front = -1;
	        rear = -1;
        }
   }
}

void printQueue(){
    if(rear == -1)
        printf("\nQueue is empty");
    else{
        int i;
        printf("\nQueue elements :");
        
        for(i = front; i <= rear; i++)
	        printf("%d ",queue[i]);
   }
}
void main(){
    int choice, item;
    do{
        printf("\n***********************");
        printf("\n********MENU***********");
        printf("\n***********************");
        printf("\n1 Enqueue");
        printf("\n2 Dequeue");
        printf("\n3 Display Queue");
        printf("\n0 Exit");
        printf("\nEnter your choice: ");
        scanf("%d", &choice);
        switch(choice){
            case 1: printf("Input Data to enter in queue: ");
                    scanf("%d",&item);
                    enqueue(item);
                    break;
            case 2: dequeue();
                    break;
            case 3: printQueue();
                    break;
            case 0: break;

        }

    }while(choice!=0);
}