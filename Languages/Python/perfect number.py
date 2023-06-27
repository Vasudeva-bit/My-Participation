n = int(input("Enter the number value: "))
sum = 0
for i in range(1, n//2+1):
    if(n % i == 0):
        sum += i
if(sum == n):
    print("Perfect")
else:
    print("Not Perfect") 