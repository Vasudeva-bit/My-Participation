#include <bits/stdc++.h>

using namespace std;

string ltrim(const string &);
string rtrim(const string &);
vector<string> split(const string &);

/*
 * Complete the 'solve' function below.
 *
 * The function is expected to return a STRING_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY arr
 *  2. 2D_INTEGER_ARRAY queries
 */

#include<stdio.h>
#include<assert.h>
#define MaxN 100000
int A[MaxN+1];
int main()
{
    int N,Q,x,y,last=1,flip;
    scanf("%d",&N);
    for(int i=1;i<=N;i++){
        scanf("%d",&A[i]);
        assert(0 <= A[i] && A[i]<=9);
        assert(!(last==0 && last==A[i]));
        last=A[i];
    }
    scanf("%d",&Q);
    while(Q--){
        scanf("%d %d",&x,&y);
        assert(x<=y && y<=N && x>=1);
        if(x!=y && A[x+1]==0)    flip=1;
        else    flip=0;
        if(flip)    printf("Odd\n");
        else if(A[x]&1)    printf("Odd\n");
        else    printf("Even\n");
    }
    return 0;
}