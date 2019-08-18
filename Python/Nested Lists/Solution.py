#author SANKALP SAXENA  

if __name__ == '__main__':
    a = []
    marks = 0.0
    N = int(input())    
    for _ in range(N):
        name = input()
        score = float(input())
        a.append([name, score])
       
 
    secondlast = marks
    for _ in range(N):
        if(a[_][1] > marks):
            secondlast = marks
            marks = a[_][1]

    b = []    
    for _ in range(N):
        if(a[_][1] == secondlast):
            b.append(a[_][0])

       
    b.sort()
  
    for i in range(len(b)):

        print(b[i])    
    

