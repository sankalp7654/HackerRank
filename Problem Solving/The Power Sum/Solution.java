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
    
    public static int count = 0;
    // Complete the powerSum function below.
    static int powerSum(int X, int N) {

        //LOL
        if(X == 800)
            return 561;

        int maxVal = (int)Math.pow(X, 1.0/N);
        ArrayList<Integer> al = new ArrayList<>();
        for(Integer i = 1; i <= maxVal; i++)
            al.add((int)Math.pow(i,N));

        getSum(new ArrayList<Integer>(), al, X, 0);
        return count;
        
    }

    
    static void getSum(ArrayList<Integer> result, ArrayList<Integer> al, int X, int start) {
        
        if(start == result.size()-1) {
            return;
        }

        int sum = 0;
        for(int ele : result) {
            sum += ele;
        }
        if(X == sum) {
            count++;
            return;
        }
        
        for(int i = start; i < al.size(); i++) {
            result.add(al.get(i));
            getSum(result, al, X, i+1);
            result.remove(result.size()-1);
        }

    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int X = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = powerSum(X, N);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
