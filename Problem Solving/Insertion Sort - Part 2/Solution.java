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

    // Complete the insertionSort2 function below.
    static void insertionSort2(int n, int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            if(i == 0)
                continue;
            
            int flag = 0;
            int val = arr[i];
            for(int k = 0; k < i; k++) {
                if((k==n-1) || (arr[k] > val)) {
                    int tt = i;
                    while(tt != k) {
                        arr[tt] = arr[tt-1];
                        tt--;
                    }
                    arr[k] = val;
                    flag = 1;
                }
                if(flag == 1) 
                break;
            }

            for(int j = 0; j < arr.length; j++) 
                System.out.print(arr[j] + " "); 
            System.out.println();   
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        insertionSort2(n, arr);

        scanner.close();
    }
}
