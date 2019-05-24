#author SANKALP SAXENA  



# Complete the solve function below.
def solve(s):
    l = s.split(" ")
    t = ''
    for ch in l:
        t += ch.capitalize() + " "
    return t

