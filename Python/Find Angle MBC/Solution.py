#author SANKALP SAXENA  

# Enter your code here. Read input from STDIN. Print output to STDOUT
import math as m
ab = int(input())
bc = int(input())

ac = m.sqrt(ab**2 + bc**2)
ac = ac/2
print(str(round(m.degrees(m.asin(ac/bc))))+'°')
