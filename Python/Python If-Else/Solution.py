#author SANKALP SAXENA  

#!/bin/python3

N = int(input())
temp = N%2
if temp != 0:
    print ("Weird");
elif temp == 0:
    if((N >= 2) and (N <= 5)):
        print ("Not Weird");
    elif((N >= 6) and (N <=20)):
        print("Weird");
    else:
        print("Not Weird");