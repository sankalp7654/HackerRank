/**  
* @author SANKALP SAXENA  
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try(Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int mat[][] = new int[n][n];
            
            // inputting the array
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    mat[i][j] = scanner.nextInt();
                }
            }
            
            int k = 0, l = 0, last_row = n-1, last_col = n-1;
            
            while((k <= last_row) && (l <= last_col)) {
                
                for(int i = l; i <= last_col; i++) {
                    System.out.print(mat[k][i] + " ");
                }
                k++;
                
                for(int i = k; i <= last_row; i++) {
                    System.out.print(mat[i][last_col] + " ");
                }
                last_col--;
                
                for(int i = last_col; i >= l; i--) {
                    System.out.print(mat[last_row][i] + " ");
                }
                last_row--;
                
                for(int i = last_row; i >= k; i--) {
                    System.out.print(mat[i][l] + " ");
                }
                l++;
            }
            
        }
    
    }
}