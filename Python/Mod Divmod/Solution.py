#author SANKALP SAXENA  

# Enter your code here. Read input from STDIN. Print output to STDOUT
a = int(input());
b = int(input());
c = a//b;
d = a%b;
print(c, d, sep = '\n');
print(divmod(a,b));