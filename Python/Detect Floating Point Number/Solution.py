#author SANKALP SAXENA  

import re 
n = int(input())

for i in range(0, n):
    string = str(input())
    print(bool(re.search("^[+-]?\d*\.\d+$", string)))
