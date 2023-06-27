age  = int(input("Enter your age: "))
citizen = input("Enter your nationality: ")
countries=["india","south Africa","USA"]
'''
if age>=18 and citizen == 'India':
    print("You can vote")
else:
    print("Modi: Get lost idiot")
'''
for country in countries:
    if citizen.lower() == country.lower():
        print(country, "you can vote!")
    else:
        print(country, "Sorry!")