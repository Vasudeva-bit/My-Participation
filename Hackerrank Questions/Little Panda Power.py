def egcd(a, b):
    if a == 0:
        return (b, 0, 1)
    else:
        g, y, x = egcd(b % a, a)
        return (g, x - (b // a) * y, y)

def modinv(a, m):
    g, x, y = egcd(a, m)
    if g != 1:
        raise Exception('modular inverse does not exist')
    else:
        return x % m

tcs = int(eval(input()))
for i in range(tcs):
    a, b, c = list(map(int, input().split(' ')))
    if b == 0:
        print((1))
    elif b < 0:
        inv = modinv(a, c)
        print((pow(inv, -b, c)))
    else:
        print((pow(a, b, c)))