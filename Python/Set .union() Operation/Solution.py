#author SANKALP SAXENA  


m = int(input())
l = input().split(" ")
#for i in range(0, m):
 #   l.append(int(input()))


n = int(input())
o = input().split(" ")


l = set(l)
o = set(o)

print(len(l.union(o)))

