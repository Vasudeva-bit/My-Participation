#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
class Node {
    public:
    char c;
    Node* next =  NULL;
};
Node* head = NULL;
void insert(char ch) {
    Node* n = new Node;
    n->c = ch;
    if(head == NULL) {
        head = n;
    }
    else {
        Node* tem = head;
        while(tem->next != NULL) {
            tem = tem->next;
        }
        tem->next = n;
        n->next = NULL;
    }
}

bool isVowel(char c) {
    if((c == 'a' or c == 'A') or
       (c == 'e' or c == 'E') or
       (c == 'i' or c == 'I') or
       (c == 'o' or c == 'O') or
       (c == 'u' or c == 'U'))
        return true;
    return false;
}

bool deleteVowels() {
    Node* tem = head;
    Node* var = NULL;
    int c  = 0;
    if(isVowel(head->c)) {
        head = head->next;
        c++;
    }
    while(tem != NULL) {
        if(isVowel(tem->c)) {
            var->next = tem->next;
            c++;
        }   
        else
            var = tem;
        tem = tem->next;
    }
    if(c > 0)
        return true;
    else {
        cout<<"No vowel in linked list";
        return false;
    }
}

void display() {
    Node* tem = head;
    while(tem->next != NULL) {
        cout<<tem->c<<"-->";
        tem = tem->next;
    }
    cout<<tem->c;
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    char ch;
    while(cin>>ch) {
        insert(ch);
    }
    if(deleteVowels())
        display();
    return 0;
}
