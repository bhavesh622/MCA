#include<malloc.h>
#include<stdio.h>

struct node{
    int coeff;
    int exp;
    struct node* next;
};
typedef struct node Node;
Node* start =NULL;
Node* curr =NULL;
void createPoly(Node** head1){
    int flag;
    int coe,pow;
    Node*node;
    node = (Node*)malloc(sizeof(Node));
    *head1 =node;
    do
    {
        printf("\nInput the coefficient: ");
        scanf("%d",&coe);
        printf("\nInput the power: ");
        scanf("%d",&pow);
        node->coeff = coe;
        node->exp = pow;
        node->next = NULL;
        printf("\n Do you want to add more terms to the polynomial? ");
        scanf("%d",&flag);
        if(flag){
            Node *newNode = (Node*)malloc(sizeof(Node));
            node->next = newNode;
            node = newNode;
            node->next = NULL;
        }
    }while(flag);
}
void printPoly(Node *node){
    printf("\nPolynomial expression is : ");
    while(node!=NULL){
        printf("%dx^%d",node->coeff,node->exp);
        node= node->next;
        if(node!=NULL)
            printf(" + ");
    }
}
void addPoly(Node**start,Node*p,Node*q){
    Node *node = (Node*)malloc(sizeof(Node));
    node -> next = NULL;
    *start = node;
    while(p&&q){
        if(p->exp > q->exp){
            node->exp = p->exp;
            node ->coeff = p->coeff;
            p = p->next;
        }
        else if (p->exp < q->exp){
            node->exp = q->exp;
            node->coeff = q->coeff;
            q = q->next;
        }
        else{
            node->exp = p->exp;
            node->coeff = p->coeff+q->coeff;
            p = p->next;
            q = q->next;
        }
        if(p&&q){
            Node *newNode = (Node*)malloc(sizeof(Node));
            node->next = newNode;
            node = newNode;
            node->next = NULL;
        }
    }
    while(p||q){
        Node *newNode = (Node*)malloc(sizeof(Node));
        node->next = newNode;
        node = newNode;
        node->next = NULL;
        if(p){
            node ->exp = p->exp;
            node->coeff = p->coeff;
            p = p->next;
        }
        if(q){
            node->exp = p->exp;
            node->coeff = p->coeff;
            q = q->next;
        }
    }
}
void main(){
    Node *p, *q,*r;
    printf("\n Create First Polynomial");
    createPoly(&p);
    printf("\n Create Second Polynomial");
    createPoly(&q);
    printf("\nFirst Polynomial: ");
    printPoly(p);
    printf("\nCreate Second Polynomial");
    printPoly(q);
    printf("\nAddition of Polynomials: ");
    addPoly(&r,p,q);
    printPoly(r);
}