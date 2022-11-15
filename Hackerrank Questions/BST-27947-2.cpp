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
int dist;

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

int minDist(treeNode* root, int n1, int n2) {
    if(!root) return 0;
    int left = minDist(root->left, n1, n2);
    int right = minDist(root->right, n1, n2);
    if(left and right) {
        dist = left + right;
        return 0;
    }
    else if(root->val == n1 or root->val == n2) {
        if(left or right) {
            dist = max(left, right);
            return 0;
        }
        else
            return 1;
    }
    else if(left or right) {
        return max(left, right) + 1;
    }
    else
        return 0;  
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
    int n1;
    int n2;
    cin>>n1>>n2;
    minDist(root, n1, n2);
    cout<<dist;
    return 0;
}