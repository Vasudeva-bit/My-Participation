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

void inorder(treeNode* root, vector<int>& inord) {
    if(root == NULL)
        return;
    if(root->left != NULL or root->right != NULL) 
        inord.push_back(root->val);
    inorder(root->left, inord);
    inorder(root->right, inord);
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n;
    cin>>n;
    vector<int> inord;
    treeNode* root = NULL;
    for(int i=0;i<n;i++) {
        int val;
        cin>>val;
        root = insert(root, val);
    }
    inorder(root, inord);
    sort(inord.begin(), inord.end());
    for(auto it:inord) {
        cout<<it<<" ";
    }
    return 0;
}