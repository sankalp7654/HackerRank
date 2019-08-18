/**  
* @author SANKALP SAXENA  
*/

import static java.lang.System.*;

class Prime {
    
    public void checkPrime(int ... number) {
        int length = number.length;
        int index = 0;
        int start = 0;
        while(start < length) {
            int num = number[index++];        
           if(num == 1){
            start++;
            continue;
           
           }
            boolean flag = true;
            for(int i = 2; i < num; i++){
                if(num % i !=0) {
                    flag = true;   
                }
                else {
                    flag = false;
                    break;
                }
                    
            }
            if(flag)
                System.out.print(num + " "); 
            start++;
        }
        System.out.println();
        
    }
}

