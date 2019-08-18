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

    // Complete the lonelyinteger function below.
    static int lonelyinteger(int[] a) {

        Map<Integer, Integer> mp = new HashMap<>();
        for(int i : a) {
            if(mp.get(i) != null) {
                mp.put(i, mp.get(i) + 1);
            }
            else {
                mp.put(i, 0);
            }
        }
           
        System.out.println(mp.get(0)); 
    
        int val = 0;
        for(int key: mp.keySet()) {
            if(mp.get(key).equals(0)) {
                val  = key;
                break;
            }
        }  
        return val;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = lonelyinteger(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
