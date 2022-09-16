#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
class Node {
    public:
    string name;
    int bond;
    Node* next =  NULL;
};
Node* head = NULL;

void insert(string name, int bond) {
    Node* n = new Node;
    n->name = name;
    n->bond = bond;
    if(head == NULL) {
        head = n;
    }
    else {
        Node* tem = head;
        if(head->bond < bond) {
            n->next = head;
            head = n;
        }
        else{    
            while(tem->next != NULL and tem->next->bond >= bond) {
                tem = tem->next;
            }
            n->next = tem->next;
            tem->next = n;
        }
    }
}

void display() {
    Node* tem = head;
    while(tem != NULL) {
        cout<<tem->name<<" ";
        tem = tem->next;
    }
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n;
    cin>>n;
    if(!(n >= 5 and n < 10)) {
        cout<<"Invalid Input";
    }
    else{
        for(int i=0;i<n;i++) {
            string name;
            cin>>name;
            int bond;
            cin>>bond;
            insert(name, bond);
        }
        display();
        string name;
        int bond;
        cin>>name;
        cin>>bond;
        insert(name, bond);
        cout<<endl;
        display();
    }
    return 0;
}
