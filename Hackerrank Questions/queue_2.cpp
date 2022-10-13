#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <queue>
using namespace std;
void insert(queue<string>& q) {
    int n;
    cin>>n;
    if(n > 9) {
        cout<<"No other spectator is allowed";
    }
    for(int i=0;i<n;i++) {
        string name;
        cin>>name;
        if(i % 2 != 0)
            q.push(name);
    }
}
void display(queue<string>& q) {
    while(!q.empty()) {
        cout<<q.front();
        q.pop();
    }
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n;
    queue<string> q;
    while(cin>>n){
        if(n == 1) {
            insert(q);
        }
        else if(n == 2) {
            display(q);
        }
    }
    return 0;
}