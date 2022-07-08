#include <stdio.h>
#include<malloc.h>
#include<limits.h>
int min= INT_MAX, max=INT_MIN ;
struct treearr{
    int arr[20];

};
int arr[20];
// typedef struct treearr;
void insert();
void root (int x){
    arr[0]= x;
}
void left(int x, int p){
    if(arr[p]==0){
        printf("Parent of %d does not exist",x);
    }
    else{
        arr[(2*p)+1]=x;
    }
}
void right(int x, int p){
    if(arr[p]==0){
        printf("Parent of %d does not exist",x);
    }
    else{
        arr[(2*p)+2]=x;
    }
}
void display(){
    printf("\n Nodes of tree: ");
    for(int i = 0;i<20;i++){
        printf("%d",arr[i]);
    }
}

// void preorder(Node* n){
//     if(n!=NULL){
//         printf("%d",n->data);
//         preorder(n->left);
//         preorder(n->right);
//     }
// }
// void preorderminmax(Node* n){
//     if(n!=NULL){
//         // printf("%d",n->data);
//         if (n->data<min) min = n->data;
//         if (n->data>max) max = n->data;
//         // printf("%d Max  so far", max);
//         // printf("%d Min so far",min);
//         preorderminmax(n->left);
//         preorderminmax(n->right);
//     }
// }
// void inorder(Node* n){
//     if(n!=NULL){
//         inorder(n->left);
//         printf("%d",n->data);
//         inorder(n->right);
//     }
// }
// void postorder(Node* n){
//     if(n!=NULL){
//         postorder(n->left);
//         postorder(n->right);
//         printf("%d",n->data);;
//     }
// }
void main(){
    int n;
    printf("\nEnter root details: ");
    scanf("%d",&n);
    root(n);
    right(3,0);
    left(2,2);
    right(1,2);
    display();

    // root->left = newnode(2);
    // root->right = newnode(3);
    // root->left->left = newnode(4);
    // root->left->right = newnode(5);
    // root->right->left = newnode(6);
    // root->right->right = newnode(7);
    // printf("\n Preorder traversal: ");
    // preorder(root);
    // printf("\n Inorder traversal: ");
    // inorder(root);
    // printf("\n Postorder traversal: ");
    // postorder(root);
    // preorderminmax(root);
    // printf("\nMax  of nodes = %d ", max);
    // printf("\nMin of nodes = %d ", min);
};