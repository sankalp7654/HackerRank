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

    // Complete the matrixRotation function below.
    static void matrixRotation(List<List<Integer>> arr, int r) {

        int m = arr.size();
        int n = arr.get(0).size();

        int matrix[][] = new int[m][n];
        for(int i = 0; i < m; i++) {
            List<Integer> al = arr.get(i);
            for(int j = 0; j < n; j++) {
                matrix[i][j] = al.get(j);
            }
        }

        int temp[][] = new int[m][n];

        while(--r >= 0) {
            int k = 0, l = 0, last_row = m-1, last_col = n-1;

            while((k <= last_row) && (l <= last_col)) {

                for(int i = l; i <= last_col; i++) {
                    if(i == last_col) {
                        temp[k+1][l] = matrix[k][(i+l+1)%(last_col+1)];
                    }
                    else {
                        temp[k][i] = matrix[k][(i+1)%(last_col+1)];
                    }
                }
                k++;

                for(int i = k; i <= last_row; i++) {
                    temp[i-1][last_col] = matrix[i][last_col];
                }
                last_col--;

                for(int i = last_col; i >= l; i--) {
                    temp[last_row][i+1] = matrix[last_row][i];
                }
                last_row--;

                for(int i = last_row; i >= k; i--) {
                    temp[i+1][l] = matrix[i][l];
                }
                l++;
        
            }

            if(r != 0)
            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {
                    matrix[i][j] = temp[i][j];
                }
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }
        

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] mnr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(mnr[0]);

        int n = Integer.parseInt(mnr[1]);

        int r = Integer.parseInt(mnr[2]);

        List<List<Integer>> matrix = new ArrayList<>();

        IntStream.range(0, m).forEach(i -> {
            try {
                matrix.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        matrixRotation(matrix, r);

        bufferedReader.close();
    }
}
