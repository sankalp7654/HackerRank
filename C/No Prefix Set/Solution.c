/**  
* @author SANKALP SAXENA  
*/

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    char a[10][20];
    int n,i,k,d,j,pos,count=0;
    int len[10];
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
         scanf("%s",a[i]);   
    }
    
   for(i=0;i<n;i++)
   {
       len[i]=strlen(a[i]);   
     
   }    
       
    for(i=0;i<n;i++)
    {
        for(j=1;j<n-1;j++)
            {
                if(strcmp(a[i],a[j])==0)
               {   
                    pos=i;
                    count++;
                    break;       
                }
        
            }
        }
        
    if(count!=0)
    {
          printf("BAD SET\n");
        printf("%s",a[pos]);
    } 
    
    else 
        printf("GOOD SET");
        
    
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    return 0;
}
