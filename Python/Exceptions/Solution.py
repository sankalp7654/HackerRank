#author SANKALP SAXENA  

# Enter your code here. Read input from STDIN. Print output to STDOUT
n = int(input())
for i in range(0, n):
    str1 = input().split(" ")
    try:
        a = int(str1[0])
        b = int(str1[1])
        c = a//b
        print(c)
    except (ValueError, ZeroDivisionError) as e:
        print("Error Code:", e)

