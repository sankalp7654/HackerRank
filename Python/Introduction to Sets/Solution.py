#author SANKALP SAXENA  

def average(array):
    s = set(array)
    avg = 0.0
    for i in s:
        avg += i
    avg = avg/(len(s))
    return avg

