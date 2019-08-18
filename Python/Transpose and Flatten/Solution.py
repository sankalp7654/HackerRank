#author SANKALP SAXENA  

import numpy

size = input().split(" ")
n = int(size[0])
l = []
for i in range(0, n):
    a = input().split(" ")
    l.append(a)
arr = numpy.array(l, int)
trans = arr.transpose()
print(trans)
print(arr.flatten())
