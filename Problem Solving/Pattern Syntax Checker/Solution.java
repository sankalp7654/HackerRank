/**  
* @author SANKALP SAXENA  
*/

import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			   String pat = in.nextLine();
          	//Write your code
            try {
             
                Pattern pattern = Pattern.compile(pat);
                System.out.println("Valid");   
            }catch(Exception e) {
                System.out.println("Invalid");       
            }
        }
	}
}



