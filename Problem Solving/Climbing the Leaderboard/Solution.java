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

    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {

        TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();

        int rankOfAlice[] = new int[alice.length];

        int rank = 1;
        for(int i = 0; i < scores.length; i++) {
            int key = scores[i];
            if(!tm.containsKey(key)) {
                tm.put(key, rank++);
            }
        }

        Map.Entry<Integer, Integer> firstEntry = tm.firstEntry();
        Map.Entry<Integer, Integer> lastEntry = tm.lastEntry();
        for(int i = 0; i < alice.length; i++) {
            if(tm.containsKey(alice[i])) {
                rankOfAlice[i] = tm.get(alice[i]);
                continue;
            }
            else if(firstEntry.getKey() > alice[i]) {
                rankOfAlice[i] = firstEntry.getValue() + 1;
            }
            else if(lastEntry.getKey() < alice[i]) {
                rankOfAlice[i] = 1;
            }
            else {
                int aliceKey = alice[i];

                while(!tm.containsKey(aliceKey)) {
                    aliceKey--;
                }
                rankOfAlice[i] = tm.get(aliceKey);
                
                
                // for(Map.Entry<Integer, Integer> e: tm.entrySet()) {
                //     if(aliceKey < e.getKey()) {
                //         Map.Entry<Integer, Integer> lower = tm.lowerEntry(e.getKey());
                //         rankOfAlice[i] = lower.getValue();
                //         break;
                //     }
                // }
                
            }

        }
        return rankOfAlice;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int scoresCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[scoresCount];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < scoresCount; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int aliceCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] alice = new int[aliceCount];

        String[] aliceItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < aliceCount; i++) {
            int aliceItem = Integer.parseInt(aliceItems[i]);
            alice[i] = aliceItem;
        }

        int[] result = climbingLeaderboard(scores, alice);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
