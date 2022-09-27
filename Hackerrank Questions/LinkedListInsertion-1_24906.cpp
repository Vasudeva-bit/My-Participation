#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
class Node {
    public:
    int mark;
    Node* next =  NULL;
};
Node* head = NULL;

void insert(int mark) {
    Node* n = new Node;
    n->mark = mark;
    Node* tem = head;
    if(head == NULL) {
        head = n;
        head->next = NULL;
    }
    else{
        while(tem->next != NULL) {
            tem = tem->next;
        }
        tem->next = n;
        n->next = NULL;
    }
}

void insert(int mark, int pos) {
    Node* n = new Node;
    n->mark = mark;
    Node* tem = head;
    int c = 1;
    while(++c < pos) {
        tem = tem->next;
    }
    n->next = tem->next;
    tem->next = n;
}

void display() {
    Node* tem = head;
    while(tem != NULL) {
        cout<<tem->mark<<" ";
        tem = tem->next;
    }
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    for(int i=0;i<5;i++) {
        int val;
        cin>>val;
        insert(val);
    }
    int val;
    int pos;
    cin>>pos;
    cin>>val;
    insert(val, pos);
    display();
    return 0;
}
