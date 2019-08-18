/**  
* @author SANKALP SAXENA  
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        try(Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            int arr [] = new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = scanner.nextInt();

            rotate(arr, k);
        }
    }

    public static void rotate(int arr[], int k) {
        int temp [] = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            temp[(i+arr.length-k)%arr.length] = arr[i];
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println();
    }
}

