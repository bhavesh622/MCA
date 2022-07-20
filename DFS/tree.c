#include <stdio.h>
#include<malloc.h>
#include<limits.h>
int min= INT_MAX, max=INT_MIN ;
struct node{
    int data;
    struct node* left;
    struct node* right;
};
typedef struct node Node;
Node* root = NULL;
Node * newnode(){
    int item;
    Node* new = (Node*)malloc(sizeof(Node));
    printf("\n Data of Node (Input -1 for NULL): ");
    scanf("%d",&item);
    if(item==-1)
        return NULL;
    new->data = item;
    printf("\n Enter left child of %d: ",item);
    new->left = newnode();
    printf("\n Enter right child of %d: ", item);
    new->right = newnode();
    return new;
}
void preorder(Node* n){
    if(n!=NULL){
        printf("%d",n->data);
        preorder(n->left);
        preorder(n->right);
    }
}
void preorderminmax(Node* n){
    if(n!=NULL){
        if (n->data<min) min = n->data;
        if (n->data>max) max = n->data;
        preorderminmax(n->left);
        preorderminmax(n->right);
    }
}
void inorder(Node* n){
    if(n!=NULL){
        inorder(n->left);
        printf("%d",n->data);
        inorder(n->right);
    }
}
void postorder(Node* n){
    if(n!=NULL){
        postorder(n->left);
        postorder(n->right);
        printf("%d",n->data);;
    }
}
void main(){
    printf("\nEnter root details: ");
    root = newnode();
    // root->left = newnode(2);
    // root->right = newnode(3);
    // root->left->left = newnode(4);
    // root->left->right = newnode(5);
    // root->right->left = newnode(6);
    // root->right->right = newnode(7);
    printf("\n Preorder traversal: ");
    preorder(root);
    printf("\n Inorder traversal: ");
    inorder(root);
    printf("\n Postorder traversal: ");
    postorder(root);
    preorderminmax(root);
    printf("\nMax  of nodes = %d ", max);
    printf("\nMin of nodes = %d ", min);
};