#author SANKALP SAXENA  

#!/bin/python

import math
import os
import random
import re
import sys

# Complete the minimumDistances function below.
def minimumDistances(a):

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(raw_input())

    a = map(int, raw_input().rstrip().split())

    result = minimumDistances(a)

    fptr.write(str(result) + '\n')

    fptr.close()
