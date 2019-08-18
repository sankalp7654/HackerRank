#author SANKALP SAXENA  

# Enter your code here. Read input from STDIN. Print output to STDOUT

val = input().split(" ")
pattern = input()
pattern = pattern.replace('x', val[0])
r = int(pattern[3])
sum = 0

for i in range(0, r+1):
    sum += int(val[0])**i
#print(sum)

if(sum == int(val[1])): 
    print("True")
else:
    print("False")

