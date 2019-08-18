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

    // Complete the cavityMap function below.
    static String[] cavityMap(String[] g) {

        int n = g.length;

        if(n == 2) 
            return g;

        char grid[][] = new char[n][n];
        for (int x = 0; x < g.length; x++)
            grid[x] = g[x].toCharArray();        

        String result[] = new String[n];


        for(int i = 1; i <= n-2; i++) {
            for(int j = 1; j <= n-2; j++) {
                if((grid[i-1][j] < grid[i][j]) && (grid[i+1][j] < grid[i][j]) && (grid[i][j-1] < grid[i][j]) && (grid[i][j+1] < grid[i][j]))
                    grid[i][j] = 'X';
            }
        } 


        for(int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < n; j++) {
                sb.append(grid[i][j]);
            }
            result[i] = sb.toString();
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] grid = new String[n];

        for (int i = 0; i < n; i++) {
            String gridItem = scanner.nextLine();
            grid[i] = gridItem;
        }

        String[] result = cavityMap(grid);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(result[i]);

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
