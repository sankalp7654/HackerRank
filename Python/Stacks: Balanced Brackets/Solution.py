#author SANKALP SAXENA  

#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the isBalanced function below.

def isBalanced(s):
    stack = []
    top = -1
    s = list(s)
    
    for item in s:

        if len(stack) == 0 and (item == ']' or item == '}' or item == ')'):
            return "NO"

        if (item == '{' or item =='[' or item =='('):
            stack.append(item)
            top += 1
            continue

        elif stack[top] == '{' and item == '}':
            top -= 1
            stack.pop()

        elif stack[top] == '[' and item == ']':
            top -= 1
            stack.pop()
            
        elif stack[top] == '(' and item == ')':
            top -= 1
            stack.pop()

        else: 
            return "NO"


    if top == -1:
        return "YES"

    return "NO"



if __name__ == '__main__':


    t = int(input())

    for t_itr in range(t):
        s = input()

        result = isBalanced(s)
        print(result)



