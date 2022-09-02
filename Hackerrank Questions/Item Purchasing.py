n = int(input())
for i in range(n):
    q, p = [int(i) for i in input().split()]
    if(q >= 1200):
        print("{0:.6f}".format((p*q) - (p*q)*(10/100)))
    else:
        print("{0:.6f}".format((p*q)*(100/100)))