#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
class Node {
    public:
    int d = 0;
    Node* next = NULL;
};

Node* head = NULL;

void insert(int d) {
    Node* n = new Node;
    n->d = d;
    if(head == NULL) {
        head = n;
        n->next = head;
    }
    else {
        Node* tem = head;
        while(tem->next != head) {
            tem = tem->next;
        }
        tem->next = n;
        n->next = head;
    }
}
    
void deleteLast(int d) {
    int c = 0;
    Node* tem = head;
    Node* pre = NULL;
    while(c < d) {
        pre = tem;
        tem = tem->next;
        c++;
    }
    pre->next = tem->next;
}

void display() {
    Node* tem = head;
    while(tem->next != head) {
        cout<<tem->d<<" ";
        tem = tem->next;
    }
    if(tem != head)
        cout<<tem->d;
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n, m;
    cin>>n;
    cin>>m;
    for(int i=0;i<m;i++) {
        int val;
        cin>>val;
        insert(val);
    }
    deleteLast(n);
    display();
    return 0;
}
