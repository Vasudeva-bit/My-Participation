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
int m;
void Insert_Details() {
    int val;
    cin>>val;
    m = val;
    for(int i=0;i<m;i++) {
        cin>>val;
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
    int n;
    cin>>n;
    if(n == 0) {
        cout<<"SLL is Empty";
        return;
    }
    if(n < 0 or n > m) {
        cout<<"Invalid Position";
        return;
    }
    Node* tem = head;
    int c = 0;
    while(tem != NULL) {
        if(c != n)
            cout<<tem->val<<" ";
        tem = tem->next;
        c++;
    }
}
int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    Insert_Details();
    Output();
    return 0;
}