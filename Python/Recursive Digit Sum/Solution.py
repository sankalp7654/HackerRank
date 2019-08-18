#author SANKALP SAXENA  

#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the superDigit function below.

def superDigit(n):
    n = int(n)
    print(n)
    if n == 0:
        return 0
    return (n%10 + superDigit(n/10))


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nk = input().split()

    n = nk[0]

    k = int(nk[1])

    flag = True
    result = superDigit(n*k)
    while(flag):
        print(result)
        if result not in [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]:
            result = superDigit(result)
        else:
            flag = False

    fptr.write(str(result) + '\n')

    fptr.close()
