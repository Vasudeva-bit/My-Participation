#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

class Node {
    public:
        int val = 0;
        Node* next = NULL;
};
Node* head = NULL;
void Insert_Details() {
    int val;
    while(cin>>val) {
        if(head == NULL) {
            head = new Node();
            head->val = val;
        }
        else {
            Node* node = new Node();
            node->val = val;
            Node* tem = head;
            while(tem->next != NULL) {
                tem = tem->next;
            }
            tem->next = node;
        }
    }
}
void Output() {
    Node* tem = head->next;
    int val = head->val;
    while(tem != NULL) {
        if(val > tem->val)
            val = tem->val;
        tem = tem->next;
    }
    cout<<val;
}
int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    Insert_Details();
    Output();
    return 0;
}