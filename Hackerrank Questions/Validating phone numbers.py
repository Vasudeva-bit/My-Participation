import re
n = int(input())
pattern = r'^[7-9]{1}[0-9]{9}\n?\r?$'
for i in range(n) :
    if bool(re.match(pattern, input())):
        print('YES')
    else :
        print('NO')