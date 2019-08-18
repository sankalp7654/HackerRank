/**  
* @author SANKALP SAXENA  
*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                
                int length = s1.length();
                int spaces = 15 - length;
                StringBuilder sb = new StringBuilder(length+spaces);
                sb.append(s1);
                for(int j = 0; j < spaces; j++)
                    sb.append(" ");
                
                Integer n = x;
                String num = n.toString();
                
                if(num.length() == 1)
                    sb.append("0").append("0").append(num);
                
                else if(num.length() == 2)
                    sb.append("0").append(num);
                
                else
                    sb.append(num);
                
                System.out.println(sb);
            }
            System.out.println("================================");

    }
}



