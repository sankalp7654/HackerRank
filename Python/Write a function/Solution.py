#author SANKALP SAXENA  

def is_leap(year):
    leap = False
    
    if(year % 4 == 0) and (year %400 == 0 or year %100 !=0):
        return True;
    return False;

