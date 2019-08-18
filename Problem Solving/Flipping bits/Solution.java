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

    // Complete the flippingBits function below.
    static long flippingBits(long n) {

        String binaryNumber = Long.toBinaryString(n);
        System.out.println(binaryNumber);
        long [] arr = new long[32];

        StringBuilder sb = new StringBuilder();
        int count = 31;
        for(int i = binaryNumber.length()-1; i >= 0; i--) {
            if(binaryNumber.charAt(i) == '0')
                arr[count--] = 1;
            else 
                arr[count--] = 0;
        }

        for(int k = count; k >= 0; k--) {
            if(arr[k] == 0)
                arr[k] = 1;
            else
                arr[k] = 0;
        }


        for(long ele: arr) {
            sb.append(ele);
            System.out.print(ele);
        }
        System.out.println();

       // System.out.println(binaryNumber);
        //System.out.println(sb.toString());
       Long number = Long.parseLong(sb.toString(), 2);
        return number;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            long n = scanner.nextLong();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            long result = flippingBits(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
