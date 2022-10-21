#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the findConnectedComponents function below.
def count_components(i, prev_components, cliques):
    ''' Back-tracking algorithm '''
    if i >= len(cliques):
        return len(prev_components)
    c = count_components(i+1, prev_components, cliques)
    # now add a clique
    new_comp = cliques[i]
    components = []
    for comp in prev_components:
        if comp & new_comp:
            new_comp |= comp
        else:
            components.append(comp)
    if new_comp:
        components.append(new_comp)
    c += count_components(i+1, components, cliques)
    return c

if __name__ == '__main__':
    n = int(input().strip())
    d = input().strip().split()
    d = [int(v) for v in d]
    assert len(d) == n
    
    singletons = [1<<j for j in range(64)]
    print(count_components(0, singletons, d))