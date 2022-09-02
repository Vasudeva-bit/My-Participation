#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n;
    cin>>n;
    if(n == 1) {
        cout<<"Invalid Input";
        return 0;
    }
    vector<string> vec(n, "");
    string name;
    while(cin>>name) {
        if(find(vec.begin(), vec.end(), name) == vec.end()) {
            vec.push_back(name);
            cout<<name<<" ";
        }
    }
    return 0;
}
