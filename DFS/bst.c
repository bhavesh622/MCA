#include <stdio.h>
#include <malloc.h>
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
Node * insert(Node* r,int key){
    // int key;
    if(r==NULL) 
    {   Node* new = (Node*)malloc(sizeof(Node));
        // printf("\n Data of Node (Input -1 for NULL): ");
        // scanf("%d",&key);
        new->data = key;
        new->left = NULL;
        new->right = NULL;
        // if(key==-1)
        // return NULL;
        return new;
    }
    if(key<r->data){
        // printf("\nleft child of %d is %d: ",r->data,key);
        r->left =insert(r->left,key);
    }
    else{
        // printf("\nright child of %d is %d: ",r->data,key);
        r->right= insert(r->right,key);
    }
    return r;
}
Node* search(Node* r,int key){
    if(r==NULL)
        return NULL;
    if(key==r->data){
        return r;
    }
    else if(key>r->data){
        search(r->right,key);
    }
    else if(key<r->data){
        search(r->left,key);
    }
    else
        return NULL;
}
Node* successor (Node* r ){
    
}
void preorder(Node* n){
    if(n!=NULL){
        printf("%d",n->data);
        preorder(n->left);
        preorder(n->right);
    }
}
int maxnode(Node* r){
    if(r->right==NULL)
    { return r->data; }
    maxnode(r->right);

}
int minnode(Node* r){
    if(r->left==NULL){
        return r->data;
    }
    minnode(r->left);
}
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
    root = insert(root,5);
    insert(root,3);
    insert(root,9);
    insert(root,11);
    insert(root,2);
    insert (root,10);
    insert (root,12);
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
    max =maxnode(root);
    min =minnode(root);
    // preorderminmax(root);
    printf("\nMax  of nodes = %d ", max);
    printf("\nMin of nodes = %d ", min);
};