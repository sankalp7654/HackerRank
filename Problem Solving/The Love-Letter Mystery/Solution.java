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

    // Complete the theLoveLetterMystery function below.
    static int theLoveLetterMystery(String s) {

        char arr[] = s.toCharArray();
        int length = s.length();
        int count = 0;
        // Signifies odd length
        
            for(int i = 0; i < length/2; i++) {
                while(arr[i] != arr[length-i-1]) {
                    int val = (int)arr[length-i-1];
                    int val1 = (int)arr[i];
                    if(val1 < val) {
                        char ch = (char)(val- 1);
                        arr[length-i-1] = ch;
                        count ++;
                    }
                    else {
                        char ch = (char)(val1-1);
                        arr[i] = ch;
                        count ++;
                    }
                }
            }

        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = theLoveLetterMystery(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
