#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'staircase' function below.
#
# The function accepts INTEGER n as parameter.
#

def staircase(n):
    # Write your code here
    lis = []
    for i in range(n+1):
        lis.append(" "*(n-i)+"#"*i)
    for i in lis[1:]:
        print(i)

if __name__ == '__main__':
    n = int(input().strip())

    staircase(n)
