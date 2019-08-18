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

class Team {
    private int team1;
    private int team2;
    private String subjects = null;

    public Team(int team1, int team2, String subjects) {
        this.team1 = team1;
        this.team2 = team2;
        this.subjects = subjects;
    }

    public int getLength() {
        return subjects.length();
    }
}


public class Solution {

    public static String getOR(String a, String b) {

        StringBuilder sb = new StringBuilder();

        for(int k = 0; k < a.length(); k++) {   
            
            if((a.charAt(k) == '0' && b.charAt(k) == '1') || (a.charAt(k) == '1' && b.charAt(k) == '0') || (a.charAt(k) == '1' && b.charAt(k) == '1')) {
                sb.append("1");
            }   
        }

        return sb.toString();
    }

    // Complete the acmTeam function below.
    static int[] acmTeam(String[] topic) {

        int rows = topic.length - 1;
        ArrayList<Team> teams = new ArrayList<Team>();

        for(int i = 0; i <= rows-1; i++) {
            for(int j = i + 1; j <= rows; j++) {
                String a = topic[i];
                String b = topic[j];
                String result = getOR(a, b);
                Team t = new Team(i+1, j+1, result);
                teams.add(t);
            }
        }

        int count = 0;
        int max = -99999;
        for(int i = 0; i < teams.size(); i++) {
            int s = teams.get(i).getLength();
            if(max < s) {
                max = s;
            }
        }

        count = 0;
        for(int i = 0; i < teams.size(); i++) {
            int s = teams.get(i).getLength();
            if(s == max)
                count++;
        }

        int val[] = new int[2];
        val[0] = max;
        val[1] = count;

        return val;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        String[] topic = new String[n];

        for (int i = 0; i < n; i++) {
            String topicItem = scanner.nextLine();
            topic[i] = topicItem;
        }

        int[] result = acmTeam(topic);

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
