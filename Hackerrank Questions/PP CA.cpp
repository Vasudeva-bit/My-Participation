#include <bits/stdc++.h>
using namespace std;
class Node {
    public:
        int roll_no;
        char grade;
        Node* next = NULL;
};
Node* head = new Node;
void add_node() {
     Node* node = new Node;
     int roll;
     cin>>roll;
     node->roll_no = roll;
     char G;
     cin>>G;
     node->grade = G;
     Node* tmp = head;
     while(tmp->next != NULL) {
        tmp = tmp->next;
     }
     tmp->next = node;
}
void search(int roll) {
    Node* tmp = new Node;
    while(tmp != NULL) {
        if(tmp->roll_no == roll) {
            cout<<"You have secured "<<tmp->grade<<" grade";
            return;
        }
    }
    cout<<"You have not appeared for the Contest-1";
}
int main() {
    int n;
    cin>>n;
    for(int i=0;i<n;i++) {
        add_node();
    }
    int roll;
    cin>>roll;
    search(roll);
}