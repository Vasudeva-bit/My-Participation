m, n = input().split()
arr = input().split()
A = set(input().split())
B = set(input().split())
hap = 0
for i in arr:
    if(i in A):
        hap += 1
    elif(i in B):
        hap -= 1
print(hap)