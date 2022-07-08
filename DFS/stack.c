#include<stdio.h>

typedef struct stack{
    int size;
    int top;
    int arr[100];
}Stack;
int isEmpty(int top){
    if(top==-1){
        return 1;
    }
    else{
        return 0;
    }
}
int isfull(Stack* s){
    if(s->top==s->size-1) 
        return 1;
    else 
        return 0;
}
void push(int item, Stack* s){
    if(isfull(s)){
        printf("Stack is full!!\n");
        return;
    }
    else{
    s->top++;
    s->arr[s->top]= item;
    printf("%d pushed into the stack!",item);
    }
}
void pop(Stack *s){
    if (isEmpty(s->top)){
        printf("Stack Empty!!");
        return;
    }
    printf("%d popped from the stack!!",s->arr[s->top]);
    s->arr[s->top--]=0;
    return;

}
void peek(Stack*s){
    if(isEmpty(s->top)){
        printf("Stack Empty!!");
        return;
    }
    else{
        printf("%d ",s->arr[s->top]);
        return;
    }
}
void display(Stack* s){
    int i =0;
    if(isEmpty(s->top)){
        printf("Stack Empty!!");
        return;
    }

    for(i=s->top;i>=0;i--){
        printf("%d ",s->arr[i]);
    }

}
void main(){
Stack s;
s.size = 100;
s.top = -1;
int choice, item,key;
    do{
        printf("\n***********************");
        printf("\n********MENU***********");
        printf("\n***********************");
        printf("\n1 Push item to stack");
        printf("\n2 Pop Item from stack");
        printf("\n3 Peek Item");
        printf("\n4 Display Stack");
        printf("\n0 Exit");
        printf("\nEnter your choice: ");
        scanf("%d", &choice);
        switch(choice){
            case 1: printf("Input Data to push: ");
                    scanf("%d",&item);
                    push(item,&s);
                    break;
            case 2: pop(&s);
                    break;
            case 3: peek(&s);
                    break;
            case 4: display(&s);
                    break;
            case 0: break;
        }

    }while(choice!=0);
}
