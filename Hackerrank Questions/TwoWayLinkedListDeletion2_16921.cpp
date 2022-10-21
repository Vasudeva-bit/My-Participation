// version 1:
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

class Node {
    public:
    int val;
    Node *prev = NULL;
    Node *next = NULL;
};

Node *head = NULL;
Node *tail = NULL;
void insert(int d) {
    Node* n = new Node;
    n->val = d;
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

bool deleteSecondLast(int d) {
    Node* pre = NULL;
    Node* pres = NULL;
    Node* tem = head;
    while(tem != NULL) {
        if(tem->val == d){
            pre = pres;
            pres = tem;
        }
        tem = tem->next;
    }
    if(pre == NULL) {
        cout<<"Deletion not possible";
        return false;
    }
    else {
        pre->prev->next = pre->next;
        pre->next->prev = pre->prev;
    }
    return true;
}

void display() {
    Node* tem = tail;
    while(tem != NULL) {
        cout<<tem->val<<endl;
        tem = tem->prev;
    }
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n;
    cin>>n;
    if(!(n > 2 and n <= 20))
        cout<<"Invalid list size";
    else {
        for(int i=0;i<n;i++) {
            int val;
            cin>>val;
            insert(val);
        }
        int dl;
        cin>>dl;
        if(deleteSecondLast(dl))
            display();
    }
    return 0;
}


// version 2:
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
    int value;
    cin>>value;
    if(!(value > 2 and value <= 20)) {
        cout<<"Invalid list size";
        return;
    }
    for(int i=0;i<value;i++) {
        int val;
        cin>>val;
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
    int val;
    cin>>val;
    Node* tem = tail;
    int c = 0;
    if(tem == NULL)
        return;
    while(tem->prev != NULL) {
        if(tem->val == val) {
            c++;
        }
        if(c > 1) {
            tem->next->prev = tem->prev;
            tem->prev->next = tem->next;
            break;
        }
        tem = tem->prev;
    }
    if(c <= 1) {
        cout<<"Deletion not possible";
        return;
    }
    tem = tail;
    while(tem != NULL) {
        cout<<tem->val<<endl;
        tem = tem->prev;
    }
}
int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    Insert_Details();
    Output();
    return 0;
}