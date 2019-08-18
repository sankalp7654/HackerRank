#author SANKALP SAXENA  

# Enter your code here. Read input from STDIN. Print output to STDOUT


n = input().split()
l = []

for i in range(0, int(n[1])):
    l.append(input().split())

for i in range(0, int(n[0])):
    avg = 0.0
    for j in range(0, int(n[1])):
        avg += float(l[j][i])
    print(avg/int(n[1]))
