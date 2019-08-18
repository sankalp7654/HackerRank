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

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
        int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int countDays = 28;

        if(year >= 1700 && year <= 1917) {
            if(year % 4 == 0) {
                // leap year
                countDays++;
            }
        }
        else if(year == 1918) {
            countDays = 15;
            //int remDays = 256 - countDays;
        }
        else {
            if(((year%4 == 0) && (year %100 !=0)) || (year % 400 == 0)) {
                // leap year
                countDays++;
            }
            
        }

        countDays = 31 + countDays + 31 + 30 + 31 + 30 + 31 + 31;
        int remDays = 256 - countDays;
        return (remDays + ".09." + year);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
