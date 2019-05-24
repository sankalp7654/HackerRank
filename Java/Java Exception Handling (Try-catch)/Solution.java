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
        
        
        try {
            int dividend = scanner.nextInt();
            int divisor = scanner.nextInt();
            System.out.println(dividend/ divisor);
        }
        catch(ArithmeticException ex) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
        catch(InputMismatchException ex) {
            System.out.println("java.util.InputMismatchException");
        }
    }
}