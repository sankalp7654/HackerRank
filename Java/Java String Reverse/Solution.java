/**  
* @author SANKALP SAXENA  
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        StringBuffer B = new StringBuffer();
        int i = 0;
        while(i < A.length()) {
            B = B.append(A.charAt(A.length() - 1 - i));
            i++;
        }
    
        
        if(B.toString().equals(A.toString()))
            System.out.println("Yes");
        else
            System.out.println("No");
        
    }
}



