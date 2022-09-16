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
vector<int> result;
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

void display() {
    for(auto i:result)
        cout<<i<<" ";
    cout<<endl;
}

void process() {
    Node* tem = head;
    while(tem->next != head) {
        if(tem->d%2 == 0) {
            result.push_back(tem->d);
            display();
        }
        tem = tem->next;
    }
    if(tem != NULL) {
        if(tem->d % 2 == 0) {
            result.push_back(tem->d);
            display();
        }
    }
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int m;
    cin>>m;
    for(int i=0;i<m;i++) {
        int val;
        cin>>val;
        insert(val);
    }
    process();
    return 0;
}
