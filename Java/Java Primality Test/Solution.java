/**  
* @author SANKALP SAXENA  
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();

        double number = Double.parseDouble(n);
    
        boolean flag = false;
        
        if(number == 1)
            flag = false;
        
        for(double i = 2; i < number; i++){
            if(number % i == 0) {
                flag = false;
                break;
            }
            flag = true;
        }
        
        if(flag)
            System.out.println("prime");
        else if(number== 1)
            System.out.println("not prime");
        else
                        System.out.println("not prime");

        scanner.close();
    }
}
