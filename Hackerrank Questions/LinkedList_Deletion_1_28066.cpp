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
    cin>>val;
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
    Node* tem = head;
    Node* prev = head;
    Node* next = head;
    int max = 0;
    Node* previ = NULL;
    while(tem != NULL) {
        if(max < tem->val) {
            max = tem->val;
            next = tem->next;
            prev = previ;
        }
        previ = tem;
        tem = tem->next;
    }
    prev->next = next;
    tem = head;
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