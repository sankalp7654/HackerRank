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

    // Complete the anagram function below.
    static int anagram(String s) {

        int sizeOfString = s.length();
        if(sizeOfString%2 != 0)
            return -1;

        String s1 = s.substring(0, sizeOfString/2);
        String s2 = s.substring(sizeOfString/2, sizeOfString);

        TreeMap<Character, Integer> map1 = new TreeMap<Character, Integer>();
        TreeMap<Character, Integer> map2 = new TreeMap<Character, Integer>();

        addElementToMap(map1, s1);
        addElementToMap(map2, s2);
        
        System.out.println(map1 + " " + map2);

        int count = 0;

        int size = 0;
        TreeMap<Character, Integer> selectMap = null;
        TreeMap<Character, Integer> otherMap = null;

        if(map1.size() > map2.size()) {
            size = map1.size();
            selectMap = map1;
            otherMap = map2;
        } else {
            size = map2.size();
            selectMap = map2;
            otherMap = map1;
        }

        for(Map.Entry<Character, Integer> entry: selectMap.entrySet()) {
            int val = entry.getValue();
            char key = entry.getKey();

            if(otherMap.containsKey(key)) {
                int valInMap2 = otherMap.get(key);

                if(valInMap2 == val) {
                    otherMap.put(key, 0);
                }
                else if(valInMap2 > val) {
                    otherMap.put(key, valInMap2 - val);
                }
                else {
                    // A billion $$ mistake
                    otherMap.put(key, 0);
                }
            }
        }

        for(Map.Entry<Character, Integer> entry: otherMap.entrySet()) {
            int val = entry.getValue();
            char key = entry.getKey();

            if(val > 0) {
                count += val;
            }
        }

        
        System.out.println(s1 + " " + s2);
                System.out.println(map1 + " " + map2);

        return count;
    }

    static void addElementToMap(TreeMap<Character, Integer> map, String s) {
        for(int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            
            if(map.containsKey(key)) {
                int val = map.get(key);
                map.put(key, val+1);
            }
            else {
                map.put(key, 1);

            }
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = anagram(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
