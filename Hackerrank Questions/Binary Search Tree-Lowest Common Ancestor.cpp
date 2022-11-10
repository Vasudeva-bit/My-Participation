/*The tree node has data, left child and right child 
class Node {
    int data;
    Node* left;
    Node* right;
};

*/
  
    Node *lca(Node *root, int v1,int v2) {
		// Write your code here.
        if(root == NULL)
            return NULL;
        if(root->data == v1 || root->data == v2)
            return root;
        Node* left_lca = lca(root->left, v1, v2);
        Node* right_lca = lca(root->right, v1, v2);
        if(left_lca and right_lca)
            return root;
        if(left_lca != NULL) return left_lca;
        else return right_lca;
    }