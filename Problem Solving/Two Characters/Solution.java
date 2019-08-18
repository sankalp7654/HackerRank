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

    // Complete the alternate function below.
    static int alternate(String s) {

        TreeSet<Character> set = new TreeSet<Character>();
        for(int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        System.out.println(set);

        ArrayList<ArrayList<Character>> pairs = new ArrayList<>();

        char arr[] = new char[set.size()];
        int k = 0;
        for(char ch : set) {
            arr[k++] = ch;
        }

        for(int i = 0; i < set.size()-1; i++) {
            for(int j = i+1; j < set.size(); j++) {
                ArrayList<Character> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[j]);
                pairs.add(pair);
            }
        }

        int maxLength = 0;
        for(ArrayList<Character> al : pairs) {
            System.out.println(al);
            String newString = s.replaceAll(Character.toString(al.get(0)), "");
            newString = newString.replaceAll(Character.toString(al.get(1)), "");
            boolean status = isTwoCharacter(newString);
            System.out.println(status);
            if(status)
                if(getLength(newString) > maxLength) {
                    maxLength = getLength(newString);
                    System.out.println(maxLength);
                }

        }

        System.out.println(pairs);
        return maxLength;
    }

    public static int getLength(String s) {
       
        return s.length();
    }

    static boolean isTwoCharacter(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                return false;
            }
        }
        System.out.println(s);
        return true;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int l = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int result = alternate(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
