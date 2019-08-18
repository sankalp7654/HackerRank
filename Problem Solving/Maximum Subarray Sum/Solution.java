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

    public static long maxSum;
    public static ArrayList<ArrayList<Long>> subarrays = new ArrayList<>();

    // Complete the maximumSum function below.
    static long maximumSum(long[] a, long m) {

        computeSubArrays(new ArrayList<Long>(), a, m, 0);

        //System.out.println(subarrays);

        // for(ArrayList<Long> array: subarrays) {
            
        // }

        return maxSum;

    }

    public static void computeSubArrays(ArrayList<Long> result, long a[], long m, int start) {

        
        if(result.size()-1 == start) {
            return;
        }
        

        long sum = 0;
        for(Long value : result) {
            sum += value;
        }
        sum = sum % m;

        if(maxSum < sum)
            maxSum = sum;

        //subarrays.add(new ArrayList<Long>(result));
        //System.out.println(result);


        
        for(int i = start; i < a.length; i++) {
            result.add(a[i]);
            computeSubArrays(result, a, m, i+1);
            result.remove(result.size()-1);
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] nm = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nm[0]);

            long m = Long.parseLong(nm[1]);

            long[] a = new long[n];

            String[] aItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                long aItem = Long.parseLong(aItems[i]);
                a[i] = aItem;
            }

            long result = maximumSum(a, m);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
