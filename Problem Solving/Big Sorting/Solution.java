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

class SortInteger implements Comparator<String> {
    @Override
    public int compare(String aS, String bS) {
        BigInteger a = new BigInteger(aS);
        BigInteger b = new BigInteger(bS);
        if(a.compareTo(b) > 0)
            return 1;
        else if(a.compareTo(b) < 0)
            return -1;
        else
            return 0;
    }
}
public class Solution {

    // Complete the bigSorting function below.
    static void bigSorting(String[] unsorted) throws IOException{

        ArrayList<String> al = new ArrayList<String>();
        for(String s : unsorted)
            al.add(s);
        
        Collections.sort(al, new SortInteger());

BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
       for (int i = 0; i < al.size(); i++) {
            bufferedWriter.write(al.get(i));

            if (i != al.size() - 1) {
                bufferedWriter.write("\n");
            }
        }
            

         bufferedWriter.newLine();

        bufferedWriter.close();
        //    System.out.println(s);
        
        //String[] strArr = new String[al.size()];
        //strArr = al.toArray(strArr);

       // return strArr;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] unsorted = new String[n];

        for (int i = 0; i < n; i++) {
            String unsortedItem = scanner.nextLine();
            unsorted[i] = unsortedItem;
        }

        bigSorting(unsorted);

        // for (int i = 0; i < result.length; i++) {
        //     bufferedWriter.write(result[i]);

        //     if (i != result.length - 1) {
        //         bufferedWriter.write("\n");
        //     }
        // }

        //bufferedWriter.newLine();

      //  bufferedWriter.close();

        scanner.close();
    }
}
