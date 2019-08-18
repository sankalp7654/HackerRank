#author SANKALP SAXENA  


n = int(input())
n = set(input().split(" "))

# applying the set comprehension
n = {int(i) for i in n}

i = int(input())
for k in range(0, i):
    u = input().split(" ")
    
    if u[0] == 'pop':
        n.pop()
        print(n)
    elif u[0] == 'discard':
        n.discard(int(u[1]))
        print(n)
    elif u[0] == 'remove':
        n.discard(int(u[1]))
        print(n)

print(sum(n))
