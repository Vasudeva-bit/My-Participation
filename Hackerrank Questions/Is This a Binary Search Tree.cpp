/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node struct is defined as follows:
	struct Node {
		int data;
		Node* left;
		Node* right;
	}
*/
    bool check(Node* root, long left, long right) {
        if(root == NULL)
            return true;
        else if(!(left < root->data and right > root->data))
            return false;
        else {
            return check(root->left, left, root->data) and check(root->right, root->data, right);
        }
    }
	bool checkBST(Node* root) {
		return check(root, -1e9, 1e9);
	}