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

    // Complete the insertionSort1 function below.
    static void insertionSort1(int n, int[] arr) {

        int val = arr[n-1], flag = 0;;
        for(int i = n - 1; i >= 0; i--){

            if( (i == 0) || (arr[i-1] < val) ){
                arr[i] = val;
                flag = 1;

            }
            else {
                        arr[i] = arr[i-1];

            }
            for(int j = 0; j < arr.length; j++)
                System.out.print(arr[j] + " ");
            System.out.println();
            
            if(flag ==1)break;

            

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

        insertionSort1(n, arr);

        scanner.close();
    }
}

