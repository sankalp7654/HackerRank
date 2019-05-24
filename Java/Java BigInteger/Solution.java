/**  
* @author SANKALP SAXENA  
*/

import java.io.*;
import java.util.*;
import java.math.BigInteger;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner (System.in);
        String a = scanner.next();
        String b = scanner.next();
        
        BigInteger bigInteger1 = new BigInteger(a);
        BigInteger bigInteger2 = new BigInteger(b);
    
        System.out.println(bigInteger1.add(bigInteger2));
        
        System.out.println(bigInteger1.multiply(bigInteger2));
    }
}