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
        int [] returnDate = new int[3];
        int [] expectedDate = new int[3];
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner br = new Scanner(System.in);
        
        for(int i = 0; i < 3; i++)
            returnDate[i] = br.nextInt(); 
        
        for(int i = 0; i < 3; i++)
            expectedDate[i] = br.nextInt(); 
        
        int fine = 0;
        if((returnDate[0] <= expectedDate[0]) && (returnDate[1] <= expectedDate[1]) && (returnDate[2] <= expectedDate[2]))
            fine = 0;
        
        else if((returnDate[0] <= expectedDate[0]) && (returnDate[1] <= expectedDate[1]) && (returnDate[2] == returnDate[2] + 1))
            fine = 0;
            
        else if((returnDate[0] >= expectedDate[0]) && (returnDate[1] == expectedDate[1]) && (returnDate[2] == expectedDate[2]))
            fine = 15 * (returnDate[0] - expectedDate[0]);
         
        else if((returnDate[1] >= expectedDate[1]) && (returnDate[2] == expectedDate[2]))
            fine = 500 * (returnDate[1] - expectedDate[1]);
        
        else if(returnDate[2] >= expectedDate[2])
            fine = 10000;
        
        else
            fine = 0;
        
        System.out.println(fine);
         
    }
}