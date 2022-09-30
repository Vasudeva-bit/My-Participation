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
Node* tail = NULL;
void Insert_Details() {
    int val;
    cin>>val;
    if(!(val >=5 and val < 15)) {
        cout<<"Invalid Input.";
        return;
    }
    while(cin>>val) {
        Node* n = new Node();
        n->val = val;
        if(head == NULL) {
            head = n;
            tail = head;
        }
        else {
            Node* tem = head;
            while(tem->next != NULL) {
                tem = tem->next;
            }
            tem->next = n;
            n->prev = tem;
            tail = n;
        }
    }
}
void Output() {
    Node* tem = head;
    while(tem != NULL and tem->next != NULL) {
        cout<<tem->val<<" ";
        if(tem->next == NULL)
            break;
        tem = tem->next;
    }
    if(tail == NULL)
        return;
    tem = tail->prev;
    cout<<endl;
    while(tem != NULL) {
        cout<<tem->val<<" ";
        tem = tem->prev;
    }
}
int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    Insert_Details();
    Output();
    return 0;
}