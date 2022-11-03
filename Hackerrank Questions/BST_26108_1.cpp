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
    if(root == NULL) return;
    inorder(root->left, inord);
    inord.push_back(root->val);
    inorder(root->right, inord);
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n;
    cin>>n;
    vector<int> inord;
    treeNode* root = NULL;
    if(n <= 2 or n >= 10)
        cout<<"Invalid Size";
    for(int i=0;i<n;i++) {
        int val;
        cin>>val;
        root = insert(root, val);
    }
    inorder(root, inord);
    cout<<"Right of "<<inord[inord.size()-3];
    return 0;
}