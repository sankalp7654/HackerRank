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
        
        try(Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt(); 
            ArrayList<Integer> al = new ArrayList<Integer>();
            int count = 0;

            for(int i = 0; i < n; i++)
                al.add(scanner.nextInt());

            for(int i = 0; i < n; i++) {
                int k = i;
                do {                int sum = 0;

                    for(int j = i; j <= k; j++) {
                        sum += al.get(j);
                    }
                    if(sum < 0)
                        count++;
                }while(++k < n);
            }
            System.out.println(count);

        }
    }
}

