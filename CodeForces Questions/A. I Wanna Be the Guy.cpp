#include<bits/stdc++.h>
using namespace std;
#define vi vector<int>
#define loop(i, j, k) for(int i=j;i<k;i++)
int main(void){
    int levels;
    cin>>levels;
    vector<int> var(levels, 0);
    int p1, p2;
    cin>>p1;
    // loop
    loop(i, 0, p1){
        int val;
        cin>>val;
        var[val-1] = 1;
    }
    cin>>p2;
    // loop
    loop(i, 0, p2){
        int val;
        cin>>val;
        var[val-1] = 1;
    }
    if(levels == accumulate(var.begin(), var.end(), 0)){
        cout<<"I become the guy.";
    }
    else{
        cout<<"Oh, my keyboard!";
    }
}