#include<conio.h>
#include<stdio.h>
#include<malloc.h>

struct node{
    int data;
    struct node* next;
};
typedef struct node Node;
Node* head =NULL;
Node* curr =NULL;
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
        while(loc->next!=NULL){
            // printf("%d",loc->data);
        loc = loc->next;
        }
        loc->next = ptr;
    }
    else{
        insertAtBeginning(item);
    }
    }
void insertAfterElement(int item, int key){
    Node*loc = head;
    while(loc!=NULL && loc->data!=key){
            // printf("%d",loc->data);
    loc = loc->next;
    }
    if(loc==NULL){
        printf("\nElement not found!!");
    }
    else{
        Node*ptr = (Node*)(malloc(sizeof(Node)));
        ptr->data = item;
        ptr->next = NULL;
        ptr->next = loc->next;
        loc->next = ptr;
    }
}
void deleteAtBeginning(){
    Node* temp;
    if(head==NULL){
        printf("Linked list empty");
    }
    else{
        temp = head;
        head = head->next;
        printf("Item %d deleted ",temp->data);
        free(temp);
    }
}
void deleteElement(int key){
    Node* temp=head;
    Node* prev=temp;
    if(head==NULL){
        printf("Linked list empty");
    }
    else{
        while(temp!=NULL && temp->data!=key){
            // printf("%d",loc->data);
            prev= temp;
            temp = temp->next;
    }
        if(temp==NULL){
        printf("\nElement not found!!");
    }
        else{
            prev->next = temp->next;
            printf("Item %d deleted ",temp->data);
            free(temp);
        }
    }
}
void deleteAtEnd(){
    Node* temp=head;
    Node* prev=temp;
    if(head==NULL){
        printf("Linked list empty");
    }
    else if(head->next==NULL){
        printf("Item %d deleted ",head->data);
        head=NULL;
    }
    else{
        while(temp->next!=NULL){
            // printf("%d",loc->data);
            prev= temp;
            temp = temp->next;
        }
        if(temp->next==NULL){
            prev->next = NULL;
            printf("Item %d deleted ",temp->data);
            free(temp);
        }
    }
}
void search(int key){
    Node* temp=head;
    int pos=0;
    if(head==NULL){
        printf("Linked list empty");
    }
    else{
        while(temp!=NULL && temp->data!=key){
            // printf("%d",loc->data);
            pos++;
            temp = temp->next;
    }
        if(temp==NULL){
        printf("\nElement not found!!");
    }
        else{
            printf("Element found at %dth place ",pos+1);
        }
    }
}
void delList(){
    while(head!=NULL){
        deleteAtBeginning();
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
    }
}
void main(){
    int choice, item,key;
    do{
        printf("\n***********************");
        printf("\n********MENU***********");
        printf("\n***********************");
        printf("\n1 Insert at Beginnning");
        printf("\n2 Insert after Element");
        printf("\n3 Insert at end");
        printf("\n4 Delete from Beginning");
        printf("\n5 Delete Element");
        printf("\n6 Delete from End");
        printf("\n7 Search an Item");
        printf("\n8 Delete Complete List");
        printf("\n9 Display List");
        printf("\n0 Exit");
        printf("\nEnter your choice: ");
        scanf("%d", &choice);
        switch(choice){
            case 1: printf("Input Node Data: ");
                    scanf("%d",&item);
                    insertAtBeginning(item);
                    break;
            case 2: printf("Input Node Data: ");
                    scanf("%d",&item);
                    printf("Enter Element to enter Node after: ");
                    scanf("%d",&key);
                    insertAfterElement(item,key);
                    break;
            case 3: printf("Input Node Data: ");
                    scanf("%d",&item);
                    insertAtEnd(item);
                    break;
            case 4: deleteAtBeginning();
                    break;
            case 5: printf("Input Element to be Deleted: ");
                    scanf("%d",&key);
                    deleteElement(key);
                    break;
            case 6: deleteAtEnd();
                    break;
            case 7: printf("Input Element to search for: ");
                    scanf("%d",&key);
                    search(key);
                    break;
            case 8: delList();
                    break;
            case 9: displayList();
                    break;
            case 0: break;

        }

    }while(choice!=0);
}