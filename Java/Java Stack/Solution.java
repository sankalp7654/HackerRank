/**  
* @author SANKALP SAXENA  
*/

import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            
            char [] stack = input.toCharArray();
            Solution sol = new Solution();
            
            boolean flag = false;
            sol.push('A');
            
            for(char ch : stack) {
                if(ch == '(' || ch == '{' || ch == '[')
                    sol.push(ch);
                else if(ch == ')' || ch == '}' || ch == ']')
                {
                    char p = sol.pop();
                    if(sol.top == -1) {
                        System.out.println("false");
                        break;
                    }
                
                }
            }
            
            if(sol.top == 0) {
                 System.out.println("true");
            }
            else if(sol.top > 0) {
                System.out.println("false");
            }
        }
	}
    
    public char [] stack = new char[100];
    public int top = -1;
    
    public void push(char str) {
        stack[++top] = str;
    }
    
    public char pop() {
        if(top == -1)
            return ' ';
        return (stack[top --]);
    }
}



