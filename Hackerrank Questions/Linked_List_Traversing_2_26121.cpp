#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

class Node {
    public:
        int Id = 0;
        string Name = "";
        double salary = 0;
        Node* next = NULL;
};
Node* head = NULL;
void Insert_Details() {
    int n;
    cin>>n;
    for(int i=0;i<n;i++) {
        int id;
        cin>>id;
        string name;
        cin>>name;
        double salary;
        cin>>salary;
        if(head == NULL) {
            head = new Node();
            head->Id = id;
            head->Name = name;
            head->salary = salary;
        }
        else {
            Node* node = new Node();
            node->Id = id;
            node->Name = name;
            node->salary = salary;
            Node* tem = head;
            while(tem->next != NULL) {
                tem = tem->next;
            }
            tem->next = node;
        }
    }
}
void Emp_Details() {
    Node* tem = head;
    double cond = 500000.0;
    int c = 0;
    while(tem != NULL) {
        if(tem->salary > cond) {
            cout<<tem->Id<<" "<<tem->Name<<" "<<tem->salary<<endl;
            c++;
        }
        tem = tem->next;
    }
    if(!(c>0)) {
        cout<<"No Employee have salary more than 500000";
    }
}
int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    Insert_Details();
    Emp_Details();
    return 0;
}

