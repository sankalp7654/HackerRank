#author SANKALP SAXENA  

#!/bin/python3

import os
import sys

#
# Complete the twoStacks function below.
#
def twoStacks(x, a, b):
    #
    # Write your code here.
    #
    top_a = len(a) - 1
    top_b = len(b) - 1
    iteration = 0
    sum_val = 0
    while(sum_val <= x):
        stack_a_value = a[top_a]
        stack_b_value = b[top_b]

        min_val = ''
        if(stack_a_value > stack_b_value):
            min_val = 'B' 
        else:
            min_val = 'A'

        if(min_val == 'A'):
            sum_val += stack_a_value
            #print(stack_a_value)
            iteration += 1
            top_a -= 1
        else:
            sum_val += stack_b_value
            #print(stack_b_value)
            iteration += 1
            top_b -= 1
    return iteration+1


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    g = int(input())

    for g_itr in range(g):
        nmx = input().split()

        n = int(nmx[0])

        m = int(nmx[1])

        x = int(nmx[2])

        a = list(map(int, input().rstrip().split()))

        b = list(map(int, input().rstrip().split()))

        result = twoStacks(x, a, b)

        fptr.write(str(result) + '\n')

    fptr.close()
