#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <queue>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int m;
    cin>>m;
    queue<int> q;
    for(int i=0;i<m;i++) {
        int n;
        cin>>n;
        if(n == 1) {
            int tmp;
            cin>>tmp;
            q.push(tmp);
        }
        else if(n == 2) {
            q.pop();
        }
        else if(n == 3) {
            cout<<q.front()<<endl;
        }
    }
    return 0;
}
