#include <stdio.h>
#include <malloc.h>
typedef struct node{
    int data;
    struct node* next;
} Node;
Node*head = NULL;

void insertAtBeginning( int item){
    Node* ptr = (Node*)(malloc(sizeof(Node)));
    ptr->data = item;
    ptr->next = head;
    head = ptr;
}
void insertAtEnd(int item){
    Node*ptr = (Node*)(malloc(sizeof(Node)));
    Node*loc = head;
    ptr->data = item;
    ptr->next = NULL;
    if(loc!=NULL){
        while(loc->next!=head){
            printf("%d",loc->data);
        loc = loc->next;
        }
        loc->next = ptr;
        ptr->next = head;
    }
    else{
        insertAtBeginning(item);
    }
    }
void deleteAtBeginning(){
    Node* temp;
    Node* loc;
    if(head==NULL){
        printf("Queue empty");
    }
    else{
        temp= head;
        loc = head;
        while(loc->next!=head){
            loc= loc->next;
        }
        head = head->next;
        loc->next = head;
        printf("Item %d deleted",temp->data);
        free(temp);
    }
}
void displayList(){
    Node*ptr;
    ptr=head;
    if(ptr==NULL){
        printf("LIST IS EMPTY");
    }
    while(ptr!=NULL){
        printf("%i",ptr->data);  
        ptr=ptr->next;
        if(ptr==head)
        ptr=NULL;
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
                    insertAtEnd(item);
                    break;
            case 2: deleteAtBeginning();
                    break;
            case 3: displayList();
                    break;
            case 0: break;

        }

    }while(choice!=0);
}