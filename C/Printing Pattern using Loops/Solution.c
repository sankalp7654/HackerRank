/**  
* @author SANKALP SAXENA  
*/

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{

    int n;
    scanf("%d", &n);
  	// Complete the code to print the pattern.

    int tot_row = n + n , tot_col = n + n ;;

    int a[tot_row][tot_col];

    int num = n;
        for(int k = 0; k < n; k++ ) {
            for(int i = 1+k; i <= n+n-1-k; i++) {
                for(int j = 1+k; j <= n+n-1-k; j++) {
                    if(i == 1+k) {
                        a[1+k][j] = num;
                    }
                    if(j == 1+k) {
                        a[i][1+k] = num;
                    }
                    if(i == n+n-1-k) {
                        a[n+n-1-k][j] = num;
                    }
                    if(j == n+n-k-1) {
                        a[i][n+n-1-k] = num;
                    }
                }
            }
            num --;
        }
        
        
        for(int i = 1; i <= n+n-1; i++) {
            for(int j = 1; j <= n+n-1; j++) {
                printf("%d ", a[i][j]);
            }
            printf("\n");
        }

        
        return 0;
      }
