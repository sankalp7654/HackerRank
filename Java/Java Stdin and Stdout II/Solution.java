/**  
* @author SANKALP SAXENA  
*/

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Solution {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        double d = scan.nextDouble();
        
        
       // BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        
        scan.nextLine();
        String s = scan.nextLine();
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}