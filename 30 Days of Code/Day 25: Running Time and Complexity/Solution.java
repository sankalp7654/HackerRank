/**  
* @author SANKALP SAXENA  
*/

import java.io.*;
import java.util.*;
import java.math.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int noOfElements = in.nextInt();
        for(int k = 0; k < noOfElements; k++)
        {
            int value = in.nextInt();
            if(value == 1) 
                System.out.println("Not prime");
            else 
            {
                boolean flag = true;
                int n = (int) Math.sqrt(value);
                for(int i = 2; i <= n; i++) 
                    if(value % i == 0)
                    {
                        flag = false; 
                        i = n;
                    }
                if(flag)
                    System.out.println("Prime");
                else
                    System.out.println("Not prime");
            }
        }
    }    
}