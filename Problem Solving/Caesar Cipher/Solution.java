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

    // Complete the caesarCipher function below.
    static String caesarCipher(String s, int k) {

        StringBuilder ciphar = new StringBuilder();
        for(int i = 0; i < s.length(); i ++) {
            char chh = s.charAt(i);
            
            if((chh >= 'a') && (chh <= 'z'))
            {
                int preascii = s.charAt(i);
                int newascii = 97 + ((preascii - 97 + k)%26);
                char ch = (char)newascii;
           //     System.out.print(ch + " "); 
                ciphar.append(ch);
            }
            else if((chh >= 'A') && (chh <= 'Z'))
{
                int preascii = s.charAt(i);
                int newascii = 65 + ((preascii - 65 + k)%26);
                char ch = (char)newascii;
           //     System.out.print(ch + " "); 
                ciphar.append(ch);
            }
            else {
                   ciphar.append(chh);
                    continue;
            }
        }
         //   System.out.println(ciphar);
            return ciphar.toString();

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
