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

    // Complete the beautifulTriplets function below.
    static int beautifulTriplets(int d, int[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length-2; i++) {
            for(int j = i+1; j < arr.length-1; j++) {
                int d1 = (int)Math.abs(arr[i]-arr[j]) ;
                //Only iterate through k loop when the first condition is satisfied
                if(d1 == d) {
                    for(int k = j+1; k < arr.length; k++) {
                        int d2 = (int)Math.abs(arr[j]-arr[k]);
                        if(d2 == d)
                            count++;
                        else if(d2 > d1)
                            break;
                    }
                }
                
            }   
        }
        return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = beautifulTriplets(d, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
