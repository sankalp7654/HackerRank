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

    static boolean rotate(int a[], int startIndex) {
        int temp[] = new int[3];
        temp[0] = a[startIndex];
        temp[1] = a[startIndex + 1];
        temp[2] = a[startIndex + 2];

        int result[] = new int[3];
        result[0] = temp[0];
        result[1] = temp[1];
        result[2] = temp[2];
        boolean flag = false;

for(int i = 0;i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 3; j++) {
                if((result[0] < result[1]) && (result[1] < result[2])) {
                    a[startIndex] = result[0];
                    a[startIndex + 1] = result[1];
                    a[startIndex + 2] = result[2];
                   // System.out.println(a[startIndex] + " " + a[startIndex+1] + " " + a[startIndex + 2]);

                    return true;
                }
                result[(j+1)%3] = temp[j];
                
            }
            
            temp[0] = result[0];
            temp[1] = result[1];
            temp[2] = result[2];
               
        }
        
        return false;
    }

    // Complete the larrysArray function below.
    static String larrysArray(int[] a) {

        boolean res = false;
        for(int u = 0; u < a.length; u++)
        for(int k = 0; k <= a.length-3; k++) {
            res = rotate(a, k);
            // for(int i = 0;i < a.length; i++) {
            //     System.out.print(a[i] + " ");
            // }
            // System.out.println();
        
        }

        if(res == false)
                return "NO";
        // System.out.print("Value: ");
        // for(int ele: a) {
        //     System.out.print(ele + " ");
        // }
        // System.out.println();
        
        return "YES";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] A = new int[n];

            String[] AItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int AItem = Integer.parseInt(AItems[i]);
                A[i] = AItem;
            }

            String result = larrysArray(A);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
