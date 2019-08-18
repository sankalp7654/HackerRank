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
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        List<Integer> intList = new ArrayList<>(n);
        for(int i = 0; i < n; i++) 
            intList.add(sc.nextInt());
        
        int numberOfQueries = sc.nextInt();
        for(int i = 0; i < numberOfQueries; i++) {
            String choice = sc.next();
            switch(choice) {
                case "Insert":
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    intList.add(x, y);
                    break;
                    
                case "Delete": 
                    int u = sc.nextInt();
                    intList.remove(u);
                    break;
            }
        }
        
        for(int ele : intList)
            System.out.print(ele + " ");
    }
}