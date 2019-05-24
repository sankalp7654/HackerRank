#author SANKALP SAXENA  

# Enter your code here. Read input from STDIN. Print output to STDOUT


m = int(input())
m = input().split(" ")

n = int(input())
n = input().split(" ")

m = set(m).intersection(set(n))
print(len(m))
