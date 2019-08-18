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

    // Complete the pangrams function below.
    static String pangrams(String s) {

        // String expr = "{a-zA-Z}+";
        // Pattern pattern = Pattern.compile(expr);
        // Matcher matches = pattern.matcher(s);
        // boolean status = matches.find();
        // if(status == true)
        //     return "pangram";
        // return "not pangram";

        String str = s.toLowerCase();
        Set<Character> newSet = new HashSet<>();
        for(int i = 0; i < str.length(); i++) {

            newSet.add(str.charAt(i));
        }

        if(newSet.size() == 27) {
            return "pangram";
        }
        return "not pangram";



    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
