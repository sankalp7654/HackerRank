#author SANKALP SAXENA  

def count_substring(string, sub_string):
    l = len(sub_string)
    u = len(string)
    count = 0
    for i in range(0, u-l+1):
        if string[i : i + l] == sub_string:
            count += 1
    return (count)

