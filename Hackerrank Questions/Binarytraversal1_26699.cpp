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
int out = 1e9;
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

void height_close(treeNode* root, int level) {
    if(root == NULL)
        return;
    if(root->left == NULL and root->right == NULL) {
        if(out > level)
            out = level;
        return;
    }
    height_close(root->left, level+1);
    height_close(root->right, level+1);
}
int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n = 10;
    treeNode* root = NULL;
    for(int i=0;i<n;i++) {
        int val;
        cin>>val;
        root = insert(root, val);
    }
    height_close(root, 0);
    cout<<out;
    return 0;
}