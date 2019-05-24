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

    // Complete the taumBday function below.
    static long taumBday(long b, long w, long bc, long wc, long z) {

        long min;
        boolean flagWhite = false;
        long totalCost = 0;

        if((wc == bc) &&(bc == z) && (z ==wc)) {
            totalCost += bc*(b + w);
            return totalCost;
        }

        if(bc > wc) {
            min = wc;
            flagWhite = true;
        } 
        else  {
            min = bc;
        }

        
        if(flagWhite) {
            totalCost += wc*w;
            if(wc + z < bc) {
                totalCost += (wc+z)*b;
            }
            else {
                totalCost += (bc)*b;
            }
        }
        else {
            totalCost += bc*b;
            if(bc + z < wc) {
                totalCost += (bc+z)*w;
            }
            else {
                totalCost += (wc)*w;
            }
        }


        return totalCost;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        long t = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] bw = scanner.nextLine().split(" ");

            long b = Long.parseLong(bw[0]);

            long w = Long.parseLong(bw[1]);

            String[] bcWcz = scanner.nextLine().split(" ");

            long bc = Long.parseLong(bcWcz[0]);

            long wc = Long.parseLong(bcWcz[1]);

            long z = Long.parseLong(bcWcz[2]);

            long result = taumBday(b, w, bc, wc, z);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

