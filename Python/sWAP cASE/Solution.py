#author SANKALP SAXENA  

def swap_case(s):
    l = ''
    for ch in s:
        if(ch in "qwertyuiopasdfghjklzxcvbnm"):
            l += ch.upper()
        else:
            l += ch.lower()
    return l

