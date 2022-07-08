#include<stdio.h>

#define MAX 10
 
typedef struct{
    int top1;
    int top2;
    int ele[MAX];
}DStack;

void init( DStack *s )
{
    s->top1 = -1;
    s->top2 = MAX;
}
int isEmptyA(int top){
    if(top==-1){
        return 1;
    }
    else{
        return 0;
    }
}
int isEmptyB(int top){
    if(top==MAX){
        return 1;
    }
    else{
        return 0;
    }
}
int isfull(DStack *s){
    if( s->top2 == s->top1 + 1 ){
        return 1;
    }
    else return 0;
}
void displayA(DStack *s){
    // int i;
    // for ( i = 0; i < s->top1; i++)
    // {
    //     printf("%d ",s->ele[i]);
    // }

}
void pushA( DStack *s, int item )
{
 if( isfull(s) ){
        printf("\nStack1 Overflow");
        return;
    }
    s->top1++;
    s->ele[s->top1] = item;
    printf("\nInserted item in Stack1 : %d",item);  
}
void pushB( DStack *s, int item ){
      if( isfull(s) ){
        printf("\nStack2 Overflow");
        return;
    }
    s->top2--;
    s->ele[s->top2] = item;
    printf("\nInserted item in Stack2 : %d",item);  
}
int popA( DStack *s, int *item ){
    if( isEmptyA(s->top1) ){
        printf("\nStack Underflow Stack1");
        return -1;
    }
    *item = s->ele[s->top1--];
    return 0;
}
 
int popB( DStack *s, int *item )
{   if( isEmptyB(s->top2))
    { printf("\nStack Underflow Stack2");
        return -1;
    }
    *item = s->ele[s->top2++];
    return 0;
}
 
int main()
{ 
    int item = 0;
    int choice;
    DStack s;
    init(&s);
    // s.top2 = MAX;
    // s.top1 = -1;
    printf("\n");
    do{
        printf("\n***********************");
        printf("\n********MENU***********");
        printf("\n***********************");
        printf("\n1 Push element in Stack 1");
        printf("\n2 Enter element in Stack 2");
        printf("\n3 Pop element from Stack 1");
        printf("\n4 Pop element from Stack 2");
        printf("\n0 Exit");
        printf("\nEnter your choice: ");
        scanf("%d", &choice);
        switch(choice){
            case 1: printf("Input Data to enter in Stack1: ");
                    scanf("%d",&item);
                    pushA(&s,item);
                    break;
            case 2: printf("Input Data to enter in Stack2: ");
                    scanf("%d",&item);
                    pushB(&s,item);
                    break;
            case 3: if(popA(&s,&item)==0)
                         printf("\nDeleted item From Stack1 : %d",item);
                    break;
            case 4: if(popB(&s,&item) == 0)
                         printf("\nDeleted item From Stack2 : %d",item);
                    break;
            case 0 :break;

        }
    }while(choice!=0);
    return 0;
}