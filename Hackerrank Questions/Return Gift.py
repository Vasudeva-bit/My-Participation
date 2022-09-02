n = int(input())
for i in range(n):
    x, y = input().split()
    x = int(x)
    y = int(y)
    if(not(x%y)):
        print(x%y)
    else:
        print(1)