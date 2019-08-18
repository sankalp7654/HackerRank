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

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {
        int sumOfPrimaryDiagonal = 0,  sumOfSecondaryDiagonal = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(i == j)
                    sumOfPrimaryDiagonal += arr[i][j];
            }
        }
            System.out.println(sumOfPrimaryDiagonal);
        
        int k = arr.length - 1; 
       
        for(int i = 0; i < arr.length; i++) {
         //   for(int j = 0; j < arr[i].length-1; j++) {
         //       if((i==j) && (i != k))
                    sumOfSecondaryDiagonal += arr[i][(k--)];
             
          //  }
        }
        
        System.out.println(sumOfSecondaryDiagonal);
        
        return Math.abs(sumOfPrimaryDiagonal - sumOfSecondaryDiagonal);
        

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
