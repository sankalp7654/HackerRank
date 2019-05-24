/**  
* @author SANKALP SAXENA  
*/

import java.io.*; 
import java.util.*;
public class Solution {
public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(); //length of freeway
    int t = in.nextInt(); //number of testcases
    ArrayList<Integer> arr = new ArrayList<Integer>();
    in.nextLine();
    String str = in.nextLine();
    Scanner inStr = new Scanner(str);        

    while(inStr.hasNextInt())
    {

        arr.add(inStr.nextInt());

    }

    for(int a0 = 0; a0 < t; a0++)
    {
        int x = in.nextInt();
        int y = in.nextInt();           
        int smallest = 10;

        for(int i = x; i <= y; i++)
        {
            if(smallest > arr.get(i))
            {
                smallest = arr.get(i);                   
            }        

        }
        System.out.println(smallest);
    }
}
}