n = int(input("Enter the number into the variable: "))
for i in range(n):
    if(not(n % 3) and not(n % 5)):
        print("FizzBuzz")
    elif (not(n % 3)):
        print("Fizz")
    elif (not(n % 5)):
        print("Buzz")
    else:
        print(i)