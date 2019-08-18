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

    // Complete the flatlandSpaceStations function below.
    static int flatlandSpaceStations(int n, int[] c) {

        ArrayList<Integer> stations = new ArrayList<>();
        for(int i : c)
            stations.add(i);

        System.out.println(stations);
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);
        if(c.length == n)
            return 0;

        int start = 0, end = 0;;
        for(int i = 0; i < n; i++) {
            if(stations.contains(i)){
                end = i;
                int l = (start+end + 1)/2;
                System.out.println(l);
                al.add(l);
                start = i;
            }   
        }

        System.out.println(al);
        return Collections.max(al);
    }  

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[] c = new int[m];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = flatlandSpaceStations(n, c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
