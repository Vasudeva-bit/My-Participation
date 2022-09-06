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
bool Insert_Details() {
    int n;
    cin>>n;
    if(n <= 0)
        return 0;
    int val;
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
        n--;
    }
    if(n > 0) {
        cout<<"Invalid Input";
        return 0;
    }
    return 1;
}
string palindrom(string val) {
    int i=0;
    int j=val.size()-1;
    while(i < j) {
        if(val[i] != val[j])
            return "No";
        i++;
        j--;
    }
    return "Yes";
}
void Output() {
    Node* tem = head;
    string val = "";
    while(tem != NULL) {
        val += to_string(tem->val);
        tem = tem->next;
    }
    cout<<palindrom(val);
}
int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    if(Insert_Details())
        Output();
    return 0;
}