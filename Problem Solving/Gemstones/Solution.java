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

    // Complete the gemstones function below.
    static int gemstones(String[] arr) {

        int count = 0;
        for(int i = 0; i < arr[0].length(); i++) {
            int length = 0;
            char ch = arr[0].charAt(i);
            
            for(int j = 0; j < arr.length; j++) {
                if(arr[j].indexOf(ch) > -1) {
                                    length ++;
                }
            }
            System.out.print(ch + " ");

            if(length == arr.length)
            count ++;
        }

        if(count > 0)
        return count;
        return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            String arrItem = scanner.nextLine();
            arr[i] = arrItem;
        }

        int result = gemstones(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
