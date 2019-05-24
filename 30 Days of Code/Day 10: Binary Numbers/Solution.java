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
    private static final Scanner scanner = new Scanner(System.in);
    private static int [] remainder = new int[1000];
    
    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        Solution obj = new Solution();
        obj.convertToBinary(n);
        System.out.println(obj.printConsecutiveDigits(remainder));
        scanner.close();
    } 
    
    public void convertToBinary(int n) {
        int number = n, i = 0;
        while(number != 0) {
            int temp = number;
            number = number/2;
            remainder[i++] = temp%2;   
        }            
    }
    
    public int printConsecutiveDigits(int [] arr) {
        int consecutiveOneCount = 0;
           
        for(int i = 0; i < arr.length; i++) {
            int temp = 0; 
            if(arr[i] == 0)
                continue;
            
            if(arr[i] == 1) {
                int pos = i;
                while(arr[pos++] != 0) {
                    temp++;
                    i = pos;
                }
                if(temp > consecutiveOneCount)
                    consecutiveOneCount = temp;
            }            
        }
        return consecutiveOneCount;
    }

    
}
