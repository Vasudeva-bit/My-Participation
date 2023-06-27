user = input("Enter the user id: ")
passcode = input("Enter the password: ")

c = 0
while True:
    if c > 1:
        print("The no of chances are over, try after 30 seconds")
        break
    retype = input("Confirm the password: ")
    if passcode != retype:
        print("Retype the passcode correctly")
        c += 1
        continue
    else:
        print("You are successfully logged in")
        break