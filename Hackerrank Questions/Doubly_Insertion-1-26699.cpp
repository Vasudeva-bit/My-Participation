#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

class Node {
    public:
    string val;
    Node *prev = NULL;
    Node *next = NULL;
};

Node *head = NULL;
Node *tail = NULL;
void insert() {
    string name;
    while(cin>>name)
    {   
        Node* n = new Node;
        n->val = name;
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
            n->next = NULL;
            tail = n;
        }
    }
}

void display() {
    Node* tem = tail->prev;
    while(tem != NULL) {
        cout<<tem->val<<" ";
        tem = tem->prev;
    }
    cout<<tail->val;
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    insert();
    display();
    return 0;
}
