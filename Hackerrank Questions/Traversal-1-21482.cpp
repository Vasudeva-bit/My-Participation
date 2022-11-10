#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

typedef struct node {
    int val;
    node* left = NULL;
    node* right = NULL;
}treeNode;

treeNode* insert(treeNode* root, int val) {
    if(root == NULL) {
        treeNode* node = new treeNode();
        node->val = val;
        root = node;
    }
    if(root->val > val)
        root->left = insert(root->left, val);
    else if(root->val < val)
        root->right = insert(root->right, val);
    return root;
}

void postOrder(treeNode* root, vector<int>& postOrd) {
    if(root == NULL) return;    
    postOrder(root->left, postOrd);
    postOrder(root->right, postOrd);
    postOrd.push_back(root->val);
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n;
    cin>>n;
    vector<int> postOrd;
    treeNode* root = NULL;
    for(int i=0;i<n;i++) {
        int val;
        cin>>val;
        root = insert(root, val);
    }
    postOrder(root, postOrd);
    for(auto it: postOrd) {
        cout<<it<<" ";
    }
    return 0;
}