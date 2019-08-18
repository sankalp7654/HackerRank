#author SANKALP SAXENA  

#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the anagram function below.
def anagram(s):
    str_len = len(s)
    if(str_len % 2 != 0):
        return -1
    s1 = s[:str_len//2]
    s2 = s[str_len//2:]

    s1 = sorted(s1)
    s2 = sorted(s2)
    count = 0
    set_s1 = set(s1)
    set_s2 = set(s2)

    res_set = set_s1 - set_s2
    print(res_set)
    for ele in res_set:
        for i in range(0, len(s1)):
            if ele == s1[i]:
                count += 1

    
    return count

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    q = int(input())

    for q_itr in range(q):
        s = input()

        result = anagram(s)

        fptr.write(str(result) + '\n')

    fptr.close()
