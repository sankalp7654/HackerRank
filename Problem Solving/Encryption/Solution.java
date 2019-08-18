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

    // Complete the encryption function below.
    static String encryption(String s) {

        s = s.replaceAll(" ", "");
        int row = (int)(Math.floor(Math.sqrt(s.length())));
        int col = (int)(Math.ceil(Math.sqrt(s.length())));
        StringBuilder sb = new StringBuilder(s.length());

        if(row*col < s.length())
            row++;

        char arr[][] = new char [row][col];
        int index = 0;
        boolean flag = false;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(index == s.length()-1) {
                    arr[i][j] = s.charAt(index);
                    flag = true;
                    break;
                }
                arr[i][j] = s.charAt(index++);
            }
            if(flag) 
                break;
        }

        flag = false;
        for(int i = 0; i < col; i++) {
            for(int j = 0; j < row; j++) {
                if(arr[j][i] != ' '){
                    sb.append(arr[j][i]);
                    continue;
                }
                flag = true;
                break;
            }
            if(!flag)
                sb.append(" ");
            else 
                break;
        }
        String result = sb.toString().trim();
        System.out.println(result);
        return result.trim();

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
