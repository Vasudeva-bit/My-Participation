T = int(input())
for i in range(T):
    s = input()
    if(s.count('0')>s.count('1')):
        print('LOSE')
    else:
        print('WIN')