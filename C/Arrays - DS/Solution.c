/**  
* @author SANKALP SAXENA  
*/

#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
    int n,a[10000],b[10000],i; 
    scanf("%d",&n);
    for(i=0;i<n;i++)
            scanf("%d ",&a[i]);
    
    for(i=0;i<n;i++)
        {
        b[i]=a[n-i-1];
        printf("%d ",b[i]);
    }
    
    
    return 0;
}
