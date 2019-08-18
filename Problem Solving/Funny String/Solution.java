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

    // Complete the funnyString function below.
    static String funnyString(String s) {
        StringBuilder r = (new StringBuilder(s)).reverse();
        System.out.println(r.toString());

        int differenceS [] = new int[s.length() - 1];
        for(int i = 0; i < s.length() - 1; i++) {
            int u = s.charAt(i);
            int v = s.charAt(i + 1);
            differenceS[i] = Math.abs(u - v);
        }

        int differenceR [] = new int[s.length() - 1];
        for(int i = 0; i < s.length() - 1; i++) {
            int u = (r.toString()).charAt(i);
            int v = (r.toString()).charAt(i + 1);
            differenceR[i] = Math.abs(u - v);
        }

        int count = 0;
        for(int i = 0; i < differenceS.length; i++){
            if(differenceS[i] == differenceR[i]) {
                count ++;
            }
        }

        if(count == differenceR.length) {
            return "Funny";
        }
        return "Not Funny";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = funnyString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
