#author SANKALP SAXENA  

n = int(input())
marks = []
maxmarks = 0

index = 0

for i in range(0, n):
    string = input().split(" ")
    marks.append((float(string[1]) + float(string[2]) + float(string[3]))/3)

name = input()

for i in range(0, n):    
    if name in string:
            index = i; 
print("%.2f"%marks[index])

