/**  
* @author SANKALP SAXENA  
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int asciiOfA = A.charAt(0);
        int asciiOfB = B.charAt(0);
        
        System.out.println(A.length() + B.length());

        if(asciiOfA > asciiOfB)
            System.out.println("Yes");
        else
            System.out.println("No");
        
        
        StringBuffer sb = new StringBuffer();
        Character chA = A.charAt(0);
        Character chB = B.charAt(0);
                
        sb.append(A).append(" ").append(B);
        sb.deleteCharAt(0).insert(0, Character.toUpperCase(chA));
        sb.deleteCharAt(A.length() + 1).insert(A.length() + 1, Character.toUpperCase(chB));
        System.out.println(sb);
    
        
    }
}



