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

    // Complete the palindromeIndex function below.
    static int palindromeIndex(String s) {

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println(s + " " + sb);

        int count = 0;
        int pos[] = new int[s.length()];
        int j = 0;
        boolean palin = true;
        
        while(palin){
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == (sb.toString()).charAt(i))
                    count ++;
                else {
                    pos[j] = i;
                    j++;
                }   
            }
            if(count == s.length())
                palin = false;
            else {
                for(int u = 0; u < pos.length; u++) {
                    StringBuilder rb = new StringBuilder(s);
                    rb = rb.deleteCharAt(pos[u]);
                    sb = new StringBuilder(rb);
                    sb.reverse();
                    s = rb.toString();
                    System.out.println(s + " " + sb);

                    for (int i = 0; i < s.length(); i++) {
                        if (s.charAt(i) == (sb.toString()).charAt(i))
                            count++;
                    }
                    if(count == s.length())
                    palin = false;
                }
            }


        }
        if((palin == false) && (count == s.length()))
        return -1;



        return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = palindromeIndex(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
