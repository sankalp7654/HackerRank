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

    // Complete the marsExploration function below.
    static int marsExploration(String s) {

        int count = 0;
        int previous = 0;
        for(int i = 3; i <= s.length(); i= i+3) {

                String var = s.substring(previous, i);
                previous = i;

                System.out.println(var);
                if(var.charAt(0) != 'S') {
 count ++;
                }               

                 if(var.charAt(1) != 'O')                { count ++;}

                 if (var.charAt(2) != 'S')
                count ++;
            }   
        
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int result = marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
