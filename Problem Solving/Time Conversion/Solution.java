/**  
* @author SANKALP SAXENA  
*/

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        
        StringBuilder time = new StringBuilder("");
        if(s.charAt(8) == 'A') {
            if(s.substring(0, 2).equals("12")) {
                time.append("00");
                time.append(s.substring(2, 8));
            }
            else {
                time.append(s.substring(0, 8));
            }
                
        }
        else {
            if(s.substring(0, 2).equals("12")) {
                time.append(s.substring(0, 8));
            }
            else {
                Integer hour = Integer.parseInt(s.substring(0, 2));
                hour += 12;
                time.append(hour.toString()).append(s.substring(2, 8));
            }
        }
        
        return time.toString();

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
