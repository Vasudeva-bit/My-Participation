t = int(input())
for i in range(t):
    q = input()
    out = ""
    for ch in q:
        ch = (int(ch)+1) % 10
        out += str(ch)
    print(out)