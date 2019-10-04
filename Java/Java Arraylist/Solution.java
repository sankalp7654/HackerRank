/**  
* @author SANKALP SAXENA  
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        ArrayList<Integer[]> alist = new ArrayList<Integer[]>();
        
        for(int i = 0; i < n; i++) {
            int no_of_ele = scanner.nextInt();
            
            Integer [] intarr = new Integer[no_of_ele];
            
            for(int j = 0; j < no_of_ele; j++) {
                int ele = scanner.nextInt();
                //alist[i].add(ele);
                intarr[j] = ele;
            }
            alist.add(intarr);
            
            // note if no_of_ele = 0 then alist[i] will be null
        }
   
        int q = scanner.nextInt();
        
        int qarr[][] = new int [q][2];
        
        for(int i = 0; i < q; i++) {
            for(int j = 0; j < 2; j++) {
                qarr[i][j] = scanner.nextInt();
            }
        }
        
        
        for(int i = 0; i < q; i++) {
            int index = qarr[i][0] - 1;
            int pos = qarr[i][1] - 1;
            
            Integer [] arr = alist.get(index);
            if((arr.length == 0) || (pos >= arr.length)) {
                System.out.println("ERROR!");
                continue;
            }
            int retrieveEle = arr[pos];
            System.out.println(retrieveEle);
        }
        
        
        
    }
}
