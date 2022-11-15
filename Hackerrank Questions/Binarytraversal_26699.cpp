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

int height(treeNode* root) {
    // Write your code here.
    int left = 0;
    int right = 0;
    if(root->left != NULL) {
        left = height(root->left) + 1;
    }
    if(root->right != NULL) {
        right = height(root->right) + 1;
    }
    if(left > right)
        return left;
    else
        return right;
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n = 10;
    vector<int> inord;
    treeNode* root = NULL;
    for(int i=0;i<n;i++) {
        int val;
        cin>>val;
        root = insert(root, val);
    }
    int val;
    cin>>val;
    root = insert(root, val);
    cout<<height(root);
    return 0;
}