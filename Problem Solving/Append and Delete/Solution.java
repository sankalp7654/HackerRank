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

    // Complete the appendAndDelete function below.
    static String appendAndDelete(String s, String t, int k) {

        int index = 0;
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < t.length(); i++) {
            if((sb.toString()).equals(t)) {
                return "Yes";
            }
            if(s.charAt(i) == t.charAt(i)) {
                continue;
            }
            index = i;
            int deleteIndex = index;
            System.out.println(deleteIndex);
                
            while(sb.length() != t.substring(0, index).length()) {

                sb = sb.deleteCharAt(deleteIndex);
                System.out.println(sb + String.valueOf(sb.length()) + String.valueOf(deleteIndex));
                System.out.println(k);
                k--;
            }
            if((sb.toString()).equals(t)) {
                return "Yes";
            }
            while(k != 0) {
                sb = sb.append(t.charAt(index++));
                k--;
            }
                System.out.println(sb + String.valueOf(k));

            if((sb.toString()).equals(t)) {
                return "Yes";
            }
            else 
                return "No";

        }
        return "No";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String t = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
