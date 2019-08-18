/**  
* @author SANKALP SAXENA  
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String[] tokens = s.split("(, )+|(! )+|(\\? )+|([!@?_' ])");

        int c = 0;
        for(String sy: tokens) 
            c++;

        System.out.println(c);
        for(String token : tokens) 
            System.out.println(token);

        scan.close();
    }
}

