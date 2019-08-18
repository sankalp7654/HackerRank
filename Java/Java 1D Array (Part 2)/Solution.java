/**  
* @author SANKALP SAXENA  
*/

import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game, int current) {
        // Return true if you can win the game; otherwise, return false.
          //  System.out.println("Executed here, current "+ current);

        if(current == game.length-1 || ((current + leap) >= game.length)){
          //  System.out.println("Executed if, current "+ current);
            return true;

        }
            

        
        else {
          //  System.out.println("Executed here, current "+ current);
            //if((current-1 >= 0) && (game[current-1] == 0))
            //    return canWin(leap, game, current -1);
            

            if(((current+1) <= game.length) && (game[current+1] == 0))
                return canWin(leap, game, current+1);

            if(((current+leap) <= game.length) && (game[current+leap] == 0))
                return canWin(leap, game, current+leap);

            if(current+leap == game.length-1 ) 
                return canWin(leap, game, current+leap);

        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }
            int current = 0;
            System.out.println( (canWin(leap, game, current)) ? "YES" : "NO" );
        }
        scan.close();
    }
}

