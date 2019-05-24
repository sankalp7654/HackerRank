#author SANKALP SAXENA  

# Enter your code here. Read input from STDIN. Print output to STDOUT

m = int(input())
m = input().split(" ")

n = int(input())
n = input().split(" ")

m = set(m).symmetric_difference(set(n))
l = list(m)
#############################
l = [int(i) for i in l]     #
#############################
l.sort()
for i in l:
    print(i)
