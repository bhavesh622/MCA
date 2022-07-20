#include <stdio.h>
#include<malloc.h>
#include<limits.h>
#define size 20
int min= INT_MAX, max=INT_MIN ;
// struct treearr{
//     int arr[20];

// };
int arr[size];
int count =0;
// typedef struct treearr;
void heapify(int i){
    if(count==1){
        printf("\n Single item in the heap");
    }
    else{
        int largest = i;
        int left = (2*i)+1;
        int right = (2*i)+2;
        if(left<count && arr[left]>arr[largest]){
            largest = left;
        }
        if(right<count && arr[right]>arr[largest]){
            largest = right;
        }
        if(largest != i){
            int temp = arr[i];
            arr[i]= arr[largest];
            arr[largest]= temp;
            heapify(largest);
            }
    }
}
void insert(int item){
    if(count==0){
        arr[0]= item;
        count++;
    }
    else{
        arr[count]= item;
        count = count+1;
        for(int i = (count-1)/2;i>=0;i--){
            heapify(i);
        }
    }
}


int delet(){
    if(count==0){
        printf("\nHeap empty");
    }
    else{
        int temp = arr[0];
        arr[0] = arr[count-1];
        count--;
        heapify(0);
        return temp;
    }
}
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
    printf("\n Nodes of heap: ");
    for(int i = 0;i<count;i++){
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
    insert(n);
    insert(5);
    insert(3);
    insert(8);
    insert(10);
    insert(4);
    insert(9);
    insert(2);
    delet(); //will delete 2
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