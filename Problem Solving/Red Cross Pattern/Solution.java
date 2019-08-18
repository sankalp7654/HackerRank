/**  
* @author SANKALP SAXENA  
*/

import java.util.Scanner;

import javax.naming.InitialContext;

public class Pattern {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        
        
        int n = new Scanner(System.in).nextInt();
        
        int a[][] = new int [n+n][n+n];
        
        int num = n;
        for(int k = 0; k < n; k++ ) {
            for(int i = 1; i <= n+n-1; i++) {
                for(int j = 1; j <= n+n-1; j++) {
                    if(i == (1+k)) {
                        a[1+k][j] = num;
                    }
                    if(j == (k+1)) {
                        a[i][1+k] = num;
                    }
                    if(i == (n+n-1-k)) {
                        a[n+n-1-k][j] = num;
                    }
                    if(j == (n+n-1-k)) {
                        a[i][n+n-1-k] = num;
                    }
                }
            }
            num --;
        }
        
        
        for(int i = 1; i <= n+n-1; i++) {
            for(int j = 1; j <= n+n-1; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }

}
