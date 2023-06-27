n = int(input("Enter the number for the factorial: "))
prod = 1
for i in range(1, n+1):
    prod = prod*i
print(prod)