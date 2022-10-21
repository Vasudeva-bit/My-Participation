
/*The tree node has data, left child and right child 
class Node {
    int data;
    Node* left;
    Node* right;
};

*/
    int height(Node* root) {
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