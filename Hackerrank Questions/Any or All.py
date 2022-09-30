def palindromic(n):
    nlist = list(str(n))
    return str.join('', nlist) == str.join('', reversed(nlist))

val = int(input())
lis = list(map(int, input().split()))
print(all(i>=0 for i in lis) and any(palindromic(i) or i ==5 for i in lis))