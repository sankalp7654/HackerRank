/**  
* @author SANKALP SAXENA  
*/



    public static String getSmallestAndLargest(String s, int k) {
                
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        

        java.util.TreeSet<String> set = new java.util.TreeSet<String>(new                             java.util.Comparator<String>() {
                public int compare(String s1, String s2) {
                    if(s1.compareTo(s2) > 0)
                        return 1;
                    else if(s1.compareTo(s2) < 0)
                        return -1;
                    return 0;
                }
            }
        );

        for(int i = 0; i <= s.length()-k; i++)
            set.add(s.substring(i, k+i));

        return set.first() + "\n" + set.last();
    }

