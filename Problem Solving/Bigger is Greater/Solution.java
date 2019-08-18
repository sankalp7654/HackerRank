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

    // Complete the biggerIsGreater function below.
    static String biggerIsGreater(String w) {

        // Next greater String

        char arr[] = w.toCharArray();

        char ch = arr[0];
        int count = 1;
        for(int k = 1; k < arr.length; k++) {
            if(ch == arr[k]) {
                count++;
            }
        }
        if(count == arr.length)
            return "no answer";

        count = 1;
        int i;
        for(i = w.length()-1; i > 0; i--) {
            if(arr[i-1] >= arr[i]) {
                count++;
                continue;
            }
            else
                break;
        }

        i--;
        if(count == arr.length)
            return "no answer";

        int j = i+1;
        int min = j;
        char dh = arr[j];
        for(j = i+1; j < arr.length; j++) {
            if((arr[j] < dh)  && (arr[j] > arr[i])){
                dh = arr[j];
                min = j;
            }
        }

        char temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
        
        Arrays.sort(arr, i+1, w.length());

        return new String(arr);
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int TItr = 0; TItr < T; TItr++) {
            String w = scanner.nextLine();

            String result = biggerIsGreater(w);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
