/**  
* @author SANKALP SAXENA  
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the balancedSums function below.
    static String balancedSums(List<Integer> arr) {

        int lsum = 0, rsum = 0;
        boolean flag = false;
        for(int i = 0; i < arr.size(); i++) {
            if(i ==0)
                lsum = 0;
            else {
                for(int j = 0; j < i; j++) {
                    lsum += arr.get(j);
                }
            }

            if(i == arr.size()-1) 
                rsum = 0;
            else {
                 for(int j = i+1; j < arr.size(); j++) {
                    rsum += arr.get(j);
                }
            }


            if(lsum == rsum) {
                flag = true;
                break;
            }
            lsum = 0;
            rsum = 0;
        }

        return (flag) ? "YES" :  "NO";
         
    }


    static String solve(int[] a) {
        // Complete this function
        int sum = 0;
        int lsum = 0;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            sum = sum + a[i];
        }
        int rsum = sum;
        for (int i = 0; i < n; i++) {
            rsum = rsum - a[i];
            if (rsum == lsum) {
                return "YES";
            }
            lsum = lsum + a[i];
        }

        return "NO";
    }
  
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, T).forEach(TItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                String result = balancedSums(arr);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
