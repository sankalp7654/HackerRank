/**  
* @author SANKALP SAXENA  
*/

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

 

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    
   long int n, i=1, ch, item, top=-1;
    scanf("%ld",&n);
   long int stack[n];
    for(i=1; i<=n; i++)
    {
        scanf("%ld",&ch);
        switch(ch)
        {
            case 1: scanf("%ld",&item);
                    stack[++(top)] = item;
                    break;
                
            case 2:
                    stack[(top)--];
                    break;
                
            case 3:   long int i=0, max=stack[0];
                    for( ; i<=top ; i++)
                    {
                         if(stack[i] > max)
                         max = stack[i];
                    }
                  printf("%ld\n", max);
        }
    }
    
    return 0;
}
