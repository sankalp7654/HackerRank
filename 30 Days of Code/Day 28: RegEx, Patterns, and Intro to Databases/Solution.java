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
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        //String [] mail = new String[N];
        
        List<String> mail = new ArrayList<>(N);
        List<String> names = new ArrayList<>(N);
        
        String data [][] = new String[N][2]; 
        
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];
            
            data[NItr][0] = firstName;
            data[NItr][1] = emailID;
            
            String x = "[a-z]{1,50}@gmail.com";
            Pattern p = Pattern.compile(x);
            Matcher m = p.matcher(emailID);
            
            if(m.find()) {
                String temp = m.group();   
                mail.add(temp);
                names.add(data[NItr][0]);
            }
            
                        
        }
       // System.out.println(mail);

        Collections.sort(names);
        for(String s : names)
            System.out.println(s);

        
        scanner.close();
    }
}
