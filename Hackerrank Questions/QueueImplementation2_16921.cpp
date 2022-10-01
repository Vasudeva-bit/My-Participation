#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
int rear = -1;
int front = -1;
vector<char> que(7);
void inset(char item) {
    if(front == -1) {
        que[0] = item;
        front = 0;
        rear = 0;
    }
    else if((front == 0 and rear == 6)or(rear+1 == front)) {
        cout<<"OVERFLOW";
    }
    else {
        rear = (rear + 1)%7;
        que[rear] = item;
    }
}
void delet() {
    if(rear == front) {
        que[front] = NULL;
        front = -1;
        rear = -1;
    }
    else if(front == -1) {
        cout<<"UNDERFLOW";
    }
    else {
        que[front] = NULL;
        front = front - 1;
    }
}
void display() {
    cout<<que[front]<<endl;
    cout<<que[rear];
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n;
    while(cin>>n) {
        if(n == 1) {
            char item;
            cin>>item;
            inset(item);
        }
        else if(n == 2) {
            delet();
        }
        else {
            display();
        }
    }
    return 0;
}
