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
    int n;
    cin>>n;
    if(n <= 0)
        return;
    for(int i=0;i<n;i++) {
        int val;
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
    Node* tem = head;
    int sum = 0;
    bool flag = true;
    while(tem != NULL) {
        if(tem->val % 2 == 0) {
            flag = false;
            sum += tem->val;
        }
        tem = tem->next;
    }
    if(sum == 0 && flag)
        cout<<"No Even numbers Present";
    else
        cout<<sum;
}
int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    Insert_Details();
    Output();
    return 0;
}