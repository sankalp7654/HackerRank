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

    // Complete the equalizeArray function below.
    static int equalizeArray(int[] arr) {

        int val = arr[0];
        int drr[] = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            val = arr[i];
            for(int j = 0; j < arr.length; j++) {
                if(arr[j] == val)
                    drr[i]++;
            }
        }

        int max = drr[0];
        int index = 0;
        for(int k = 1; k < drr.length; k++) {
            if(drr[k] > max) {
                max = drr[k];
                index = k;
            }
        }

        System.out.println(max);
        int c = 0;
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] != arr[index])
                c++;
            }
        
        return c;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = equalizeArray(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
