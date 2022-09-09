#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'stringReduction' function below.
#
# The function is expected to return an INTEGER.
# The function accepts STRING s as parameter.
#

def stringReduction(s):
    # Write your code here
    n = len(s)
    a, b, c = 0, 0, 0
    for ch in s :
        if(ch == 'a'):
            a = a+1
        elif(ch == 'b'):
            b = b+1
        else:
            c = c+1
    if(a == n or b == n or c == n):
        return n;
    elif(a%2 == b%2 == c%2):
        return 2;
    else:
        return 1;

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input().strip())

    for t_itr in range(t):
        s = input()

        result = stringReduction(s)

        fptr.write(str(result) + '\n')

    fptr.close()
