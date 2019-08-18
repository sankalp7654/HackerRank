#author SANKALP SAXENA  

# Enter your code here. Read input from STDIN. Print output to STDOUT

def check_palindrome(s):
    if(s == s[::-1]):
        return True
    return False 



def main():
    n = int(input())

    for i in range(0, n):
        s = input()
        final_index = -1
        if check_palindrome(s) == True:
            print(final_index)
        else:
            for i in range(0, len(s)):
                temp = s[0:i] + s[i+1::]
                if check_palindrome(temp) == True:
                    final_index = i
                    break
            print(final_index)

if __name__ == '__main__':
    main()
