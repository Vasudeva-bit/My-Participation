#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <queue>
using namespace std;


int main() {
  int n;
  cin>>n;
  queue<int> q;
  for(int i=0;i<n;i++) {
    int tmp;
    cin>>tmp;
    if(tmp == 1) {
      int val;
      cin>>val;
      q.push(val);
    }
    else if(tmp == 0) {
      cout<<q.front()<<" ";
      q.pop();
    }
  }
  return 0;
}
