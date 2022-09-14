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
    if(!(val >= 3 and val < 12)) {
            cout<<"Wrong Input.";
            return;
    }
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
    int c = 0;
    vector<int> out;
    while(tem != NULL) {
        if((tem->val % 2) != 0) {
            c++;
        }
        else {
            out.push_back(tem->val);
        }
        tem = tem->next;
    }
    if(c == 0)
        cout<<"No student is having odd roll number.";
    else {
        for(auto it:out) {
            cout<<it<<" ";
        }
    }
}
int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    Insert_Details();
    Output();
    return 0;
}