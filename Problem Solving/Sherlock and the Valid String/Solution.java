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

    // Complete the isValid function below.
    static String isValid(String s) {

        TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();

        for(int i = 0; i < s.length(); i++) {
            if(tm.containsKey(s.charAt(i))) {
                Integer v = tm.get(s.charAt(i))+1;
                tm.replace(s.charAt(i), v);
                continue;
            }
            tm.put(s.charAt(i), 0);
        }
        System.out.println(tm);

        boolean flag = false;
        int frequency = -1;
        int enableQuit = 1;
        for(Map.Entry<Character, Integer> entry: tm.entrySet()) {
            Character key = entry.getKey();
            Integer val = entry.getValue();
            if(frequency == -1) {
                frequency = val;
                System.out.println(frequency);
                flag = true;
                continue;
            }
            if(frequency != val) {
                if(enableQuit == 1) {
                    enableQuit--;
                    if(val > frequency) {
                        System.out.println(tm.replace(key, val-1));
                        flag = true;
                    }
                }   
                else {
                    flag = false;
                    break;
                }             
            }
        }
        System.out.println(tm);
        if(flag == true)
            return "YES";
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
