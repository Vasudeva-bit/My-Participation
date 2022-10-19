#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'solve' function below.
#
# The function is expected to return a STRING.
# The function accepts following parameters:
#  1. INTEGER a
#  2. INTEGER b
#  3. INTEGER c
#

def solve(a, b, c):

    if c >= a+b:
        return '1/1'
    else:
        prob_area_mult_two = c**2 - max(0, (c-a))**2 - max(0, (c-b))**2
        all_area = a*b
        numerator = prob_area_mult_two
        denominator = all_area*2
        divisor = math.gcd(numerator,denominator)
        return str(str(numerator//divisor)+'/'+str(denominator//divisor))

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())

    for n_itr in range(n):
        first_multiple_input = input().rstrip().split()

        a = int(first_multiple_input[0])

        b = int(first_multiple_input[1])

        c = int(first_multiple_input[2])

        result = solve(a, b, c)
        fptr.write(result + '\n')

    fptr.close()
