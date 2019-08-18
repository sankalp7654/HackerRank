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
    public static int chessBoard[][];

    // Complete the queensAttack function below.
    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {

        int r = r_q-1;
        int c = c_q-1;

        //chessBoard = new int [n][n];
        populateChessBoard(r, c, n, obstacles);

        // means no obstacles then queen can attack to all possible positions available
       // if(count == -1)
         //   return 0;
        return count;


    }

    public static void populateChessBoard(int r, int c, int n, int [][] obstacle) {

        // traverse right
        for(int i = c+1; i < n; i++) {
            boolean flag = false;
            for(int k = 0; k < obstacle.length; k++) {
                int o_r = obstacle[k][0]-1;
                int o_c = obstacle[k][1]-1;

                if((o_r == r) && (o_c == i)) {
                    flag = true;
                    break;
                }
            }
            if(flag)
                break;
            count++;
        }

        // traversing left
        for(int i = c-1; i >= 0; i--) {
            boolean flag = false;
            for(int k = 0; k < obstacle.length; k++) {
                int o_r = obstacle[k][0]-1;
                int o_c = obstacle[k][1]-1;

                if((o_r == r) && (o_c == i)) {
                    flag = true;
                    break;
                }
            }
            if(flag)
                break;
            count++;
        }

        // traversing top
        for(int i = r+1; i < n; i++) {
            boolean flag = false;
            for(int k = 0; k < obstacle.length; k++) {
                int o_r = obstacle[k][0]-1;
                int o_c = obstacle[k][1]-1;

                if((o_r == i) && (o_c == c)) {
                    flag = true;
                    break;
                }
            }
            if(flag)
                break;
            count++;
        }

        // traversing bottom
        for(int i = r-1; i >= 0; i--) {
            boolean flag = false;
            for(int k = 0; k < obstacle.length; k++) {
                int o_r = obstacle[k][0]-1;
                int o_c = obstacle[k][1]-1;

                if((o_r == i) && (o_c == c)) {
                    flag = true;
                    break;
                }
            }
            if(flag)
                break;
            count++;
        }

        // traversing top right diagonal
        int temp_c = c;
        for(int i = r+1; i < n; i++) {
            temp_c++;
            if(temp_c > n)
                break;

            boolean flag = false;
            for(int k = 0; k < obstacle.length; k++) {
                int o_r = obstacle[k][0]-1;
                int o_c = obstacle[k][1]-1;

                if((o_r == i) && (o_c == temp_c)) {
                    flag = true;
                    break;
                }
            }
            if(flag)
                break;
            count++;
        }

        // traversing bottom left diagonal
        temp_c = c;
        for(int i = r-1; i >=0; i--) {
            temp_c--;
            if(temp_c < 0)
                break;

            boolean flag = false;
            for(int k = 0; k < obstacle.length; k++) {
                int o_r = obstacle[k][0]-1;
                int o_c = obstacle[k][1]-1;

                if((o_r == i) && (o_c == temp_c)) {
                    flag = true;
                    break;
                }
            }
            if(flag)
                break;
            count++;
        }

        // traversing top left diagonal
        temp_c = c;
        for(int i = r+1; i < n; i++) {
            temp_c--;
            if(temp_c < 0)
                break;

            boolean flag = false;
            for(int k = 0; k < obstacle.length; k++) {
                int o_r = obstacle[k][0]-1;
                int o_c = obstacle[k][1]-1;

                if((o_r == i) && (o_c == temp_c)) {
                    flag = true;
                    break;
                }
            }
            if(flag)
                break;
            count++;
        }

        // traversing bottom right diagonal
        temp_c = c;
        for(int i = r-1; i >= 0; i--) {
            temp_c++;
            if(temp_c > n)
                break;

            boolean flag = false;
            for(int k = 0; k < obstacle.length; k++) {
                int o_r = obstacle[k][0]-1;
                int o_c = obstacle[k][1]-1;

                if((o_r == i) && (o_c == temp_c)) {
                    flag = true;
                    break;
                }
            }
            if(flag)
                break;
            count++;
        }
    }

    public static boolean checkBoardUtils(int i, int j, int n) {
        if((i >= 0) && (i < n) && (j >= 0) && (j < n))
            return true;
        return false;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        String[] r_qC_q = scanner.nextLine().split(" ");

        int r_q = Integer.parseInt(r_qC_q[0]);

        int c_q = Integer.parseInt(r_qC_q[1]);

        int[][] obstacles = new int[k][2];

        for (int i = 0; i < k; i++) {
            String[] obstaclesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int obstaclesItem = Integer.parseInt(obstaclesRowItems[j]);
                obstacles[i][j] = obstaclesItem;
            }
        }

        int result = queensAttack(n, k, r_q, c_q, obstacles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
