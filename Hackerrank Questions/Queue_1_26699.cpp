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
    vector<string> cinema;
    int m;
    cin>>m;
    for(int i=0;i<m;i++) {
        if(i >= n) {
            cout<<"Houseful";
            return 0;
        }
        else {
            string name;
            cin>>name;
            cinema.push_back(name);
        }
    }
    cout<<"Booked";
    return 0;
}
