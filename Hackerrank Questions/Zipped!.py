a = list(map(int, input().split()))
b = [list(map(float, input().split())) for _ in range(a[1])]
for x in zip(*b):
    print(sum(x)/a[1])