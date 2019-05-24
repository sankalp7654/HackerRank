#author SANKALP SAXENA  


m = int(input())


m = input().split(" ")

n = int(input())
n = input().split(" ")

print(len(set(m).symmetric_difference(set(n))))
