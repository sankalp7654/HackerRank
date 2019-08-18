#author SANKALP SAXENA  

if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())

    arr = list(arr)
    arr.sort()
    #print(arr)

    l = -1
    i = 0
    e = 0
    f = 0
    flag = False
    while(True) :
        e = arr.pop(-1)
        if(len(arr) == 1):
            flag = True
            break
        f = arr.pop(-2)
        if(e == f) :
            continue
        else :
            break
    
    if flag == True:
        print(arr.pop(0))
    else:
        print(f)
   

