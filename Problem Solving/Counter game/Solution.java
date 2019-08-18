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

    // Complete the counterGame function below.
    static String counterGame(long n) {

        // turn 0 denotes Louise turn 
        // turn 1 denotes Richard turn 
        int turn = 0;

        while(true) {
            if(n == 1) {
                turn--;
                break;
            }
            if(isPowerOfTwo(n)) {
                n = n/2;  
            }
            else {
                n = n-nextPowerOfTwo(n);
            }
            if(turn == 0)
                    turn++;
            else
                    turn--;
        }

        if(turn == 0)
            return "Louise";
        return "Richard";
    }

    static boolean isPowerOfTwo(long n) {
        String bit = Long.toBinaryString(n);
        int count = 0;
        for(int i = 0; i < bit.length(); i++) {
            if(bit.charAt(i) == '1') {
                count++;
            }
            if(count > 1) {
                return false;
            }
        }
        System.out.println(bit);
        return true;
    }

    static long nextPowerOfTwo(long n) {
        String bit = Long.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        sb.append("1");
        for(int i = 1; i < bit.length(); i++) {
            sb.append("0");
        }
        return Long.parseLong(sb.toString(), 2);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            long n = scanner.nextLong();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String result = counterGame(n);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
