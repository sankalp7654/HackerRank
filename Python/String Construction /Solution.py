#author SANKALP SAXENA  

# Enter your code here. Read input from STDIN. Print output to STDOUT
n = int(input())

for i in range(0, n):
    s = input()
    s = list(s)
    p = []
    dollar = 0

    for item in s:
        if item not in p:
            p.append(item)
            dollar += 1
        else:
            p.append(item)

    print(dollar)

