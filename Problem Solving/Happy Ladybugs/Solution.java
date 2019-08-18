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

    // Complete the happyLadybugs function below.
    static String happyLadybugs(String b) {

        TreeMap<Character, Integer> treeMap = new TreeMap<Character, Integer>();
        for(int i = 0; i < b.length(); i++) {
            char key = b.charAt(i);
            if(treeMap.containsKey(key)) {
                int count = treeMap.get(key);
                treeMap.put(key, count + 1);
            }
            else  {
                treeMap.put(key, 1);
            }
            
        }


        boolean flag = false;
        HashSet<Character> hashSet = new HashSet<Character>();

        if(!treeMap.containsKey('_')) {
            for(int i = 0; i < b.length()-1; i++) {
                int count = 0;
                hashSet.add(b.charAt(i));
                
                for(int j = i+1; j < b.length(); j++) {
                    if(b.charAt(i) == b.charAt(j)) {
                        count++;
                    }
                    else {
                        i = j;
                        break;
                    }
                }
                if(hashSet.contains(b.charAt(i))) {
                        flag = true;
                }

                if(count == b.length()-1) {
                    return "YES";
                }
            }
            return "NO";
        }
        if(flag)
            return "NO";

        System.out.println(treeMap);

        for(Map.Entry<Character, Integer> entry: treeMap.entrySet()) {
            int value = entry.getValue();
            int key = entry.getKey();

            if((value == 1) && (key != '_')) {
                return "NO";
            }
        }
        return "YES";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int gItr = 0; gItr < g; gItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String b = scanner.nextLine();

            String result = happyLadybugs(b);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
