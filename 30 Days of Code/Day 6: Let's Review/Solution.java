/**  
* @author SANKALP SAXENA  
*/

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] str = new String[n];
        for(int i =0; i<n; i++) {
            str[i] = sc.next();
        }
        
        StringBuilder evenString = new StringBuilder();
        StringBuilder oddString = new StringBuilder();
        for(int i =0; i<n; i++) {
            for(int j=0; j<str[i].length(); j++) {
                if(j%2 == 0)
                    evenString.append(str[i].charAt(j));
                else 
                    oddString.append(str[i].charAt(j));
            }
            System.out.println(evenString + " " + oddString);
            evenString = new StringBuilder();
            oddString = new StringBuilder();
            
        }
    }
}