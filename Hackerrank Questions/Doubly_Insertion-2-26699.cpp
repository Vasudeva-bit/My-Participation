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
        Node* prev = NULL;
};
Node* head = NULL;
void Insert_Details() {
    int val;
    while(cin>>val) {
        Node* n = new Node();
        n->val = val;
        if(head == NULL) {
            head = n;
        }
        else {
            Node* tem = head;
            while(tem->next != NULL) {
                tem = tem->next;
            }
            tem->next = n;
            n->prev = tem;
        }
    }
}
void Output() {
    Node* tem = head;
    while(tem != NULL) {
        cout<<tem->val<<" ";
        tem = tem->next;
    }
}
int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    Insert_Details();
    Output();
    return 0;
}