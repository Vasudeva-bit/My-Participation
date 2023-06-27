n = int(input("Enter the nth terms in series: "))
a = 0
b = 1
for i in range(n+1):
    c = a
    a = b
    b = c + b
print(b)