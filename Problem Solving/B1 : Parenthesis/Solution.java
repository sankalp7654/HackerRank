/**  
* @author SANKALP SAXENA  
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        try(Scanner scanner = new Scanner(System.in)) {
            int t = scanner.nextInt();
            String [] result = new String[t];
            
            for(int i = 0; i < t; i++) {
                String value = scanner.next();
                result[i] = "NO";
                
                Stack<Character> stack = new Stack<Character>();
                
                if((value.charAt(0) == ')') || (value.charAt(0) == '}') || (value.charAt(0) == ']') || (value.charAt(0) == '>')) {
                    continue;
                }
                
                for(int j = 0; j < value.length(); j++) {  
                    
                    if((value.charAt(j) == '(') || (value.charAt(j) == '{') || (value.charAt(j) == '[') || (value.charAt(j) == '<')) {
                        stack.push(value.charAt(j));
                        //System.out.println(stack);

                    }
                    else {
                        char ch = value.charAt(j);
                        
                        if(ch == ')') {
                            if(stack.isEmpty()) {
                                break;
                            }
                            else if(stack.peek() == '(')
                                stack.pop();
                            else 
                                break;
                        }
                        else if(ch == '}') {
                            if(stack.isEmpty()) {
                                break;
                            }
                            else if(stack.peek() == '{')
                                stack.pop();
                            else 
                                break;
                        }
                        else if(ch == ']') {
                            if(stack.isEmpty()) {
                                break;
                            }
                            else if(stack.peek() == '[')
                                stack.pop();
                            else 
                                break;
                        }
                        else if(ch == '>') {
                            if(stack.isEmpty()) {
                                break;
                            }
                            else if(stack.peek() == '<')
                                stack.pop();
                            else 
                                break;
                        }
                        
                    }
                }
                
                if(stack.isEmpty()){
                        result[i] = "YES";
                }
            }
            
            for(String s: result) {
                System.out.println(s);
            }
        }
    }
}