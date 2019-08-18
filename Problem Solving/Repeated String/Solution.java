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

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {

        long length = s.length();

        long fixed = n / length;
        long remain = n - (fixed*length);
int c = 0;
        if(remain != 0) {
            String temp = s.substring(0, (int)(remain));
            
            for (int i = 0; i < temp.length(); i++) {
                if (s.charAt(i) == 'a')
                    c++;
            }
        }

        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a')
            count++;
        }

        long num = count * fixed;
      //  System.out.print(num + c);

        return num + c;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
