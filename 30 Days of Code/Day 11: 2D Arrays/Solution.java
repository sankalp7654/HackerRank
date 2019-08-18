/**  
* @author SANKALP SAXENA  
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void compute(int arr[][]) {
    
        int [] sumOfMatrix = new int[16];
        int u = 0;
        
        for(int i = 0; i <= 3; i++) {
            for(int j = 0; j <= 3; j++)    
            
                sumOfMatrix[u++] = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] +                                    arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
            
        }
        
      
        int max = sumOfMatrix[0];
        for(int k = 0; k < sumOfMatrix.length; k++) {
            if(sumOfMatrix[k] > max)
                max = sumOfMatrix[k];
        }
        
        System.out.println(max);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        
        compute(arr);
        scanner.close();
    }
}
