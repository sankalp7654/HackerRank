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
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {

         // If n is odd the last page will be on the right
         // IF n is even the last page will be on the left

        int minBeg = -1;
        //Beginning
        int turn = 0;
        for(int i = 1; i <= n; i++) {
            if(p == 1) {
                minBeg = 0;
                break;
            }
            else {
                turn++;
                if(p == i || p == i+1) {
                    minBeg = turn;
                    break;
                }
            }
        }

        //Ending
        turn = 0;
        int minEnd=-1;
        for(int i = n; i >= 0; i--) {
            if(p == n){
                minEnd = 0;
                break;
            }
            else {
                turn++;
                if(p == i || p == i-1) {
                    minEnd = turn;
                    break;
                }
            }
        }

        if(n%2 != 0){
            int min = (minBeg < minEnd) ? minBeg-1: minEnd-1;
            return min;}
        if (minBeg < minEnd)
            return minBeg;
        return minEnd;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int result = pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
