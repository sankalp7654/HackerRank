/**  
* @author SANKALP SAXENA  
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the superReducedString function below.
    static String superReducedString(String s) {

        StringBuilder sb = new StringBuilder(s);
        boolean flag = true;

        while(flag) {
            for(int i = 0; i < sb.length()-1; i++) {
                flag = false;
                if(sb.charAt(i) == sb.charAt(i+1)) {
                    sb.deleteCharAt(i);
                    sb.deleteCharAt(i);
                    flag = true;
                    System.out.println(sb);
                    break;
                }
            }
            if(sb.toString().equals("") == true)
                flag = false;
        }
        
        if (sb.toString().equals("") == true)
            return "Empty String";
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = superReducedString(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
