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

    // Complete the gameOfThrones function below.
    static String gameOfThrones(String s) {

        // Shitty Question 
        // Just check that there is at most one character with the odd number of occurrences

        TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();

        for(int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);

            if(map.containsKey(key)) {
                int val = map.get(key);
                map.put(key, val + 1);
            }
            else {
                map.put(key, 1);
            }
        }

        int count = 0;
        for(Map.Entry<Character, Integer> entry: map.entrySet()) {
            char key = entry.getKey();
            int val = entry.getValue();

            if(val%2 != 0) {
                count++;
            }
            if(count > 1) {
                return "NO";
            }
        }

        return "YES";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = gameOfThrones(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
