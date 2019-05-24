/**  
* @author SANKALP SAXENA  
*/

    static boolean isAnagram(String a, String b) {
        
        a = a.toUpperCase();
        b = b.toUpperCase();
        
        char arr1[] = a.toCharArray();
        char arr2[] = b.toCharArray();
        
        int [] count1 = new int[26];
        int [] count2 = new int[26];
        
        for(int i = 0; i < arr1.length; i++) {
            switch(arr1[i]) {
                case 'A' : count1[0] ++; break;
                case 'B' : count1[1] ++; break;
                case 'C' : count1[2] ++; break; 
                case 'D' : count1[3] ++; break;
                case 'E' : count1[4] ++; break;
                case 'F' : count1[5] ++; break;
                case 'G' : count1[6] ++; break;
                case 'H' : count1[7] ++; break;
                case 'I' : count1[8] ++; break;
                case 'J' : count1[9] ++; break;
                case 'K' : count1[10] ++; break;
                case 'L' : count1[11] ++; break;
                case 'M' : count1[12] ++; break;
                case 'N' : count1[13] ++; break;
                case 'O' : count1[14] ++; break;
                case 'P' : count1[15] ++; break;
                case 'Q' : count1[16] ++; break;
                case 'R' : count1[17] ++; break;
                case 'S' : count1[18] ++; break;                    
                case 'T' : count1[19] ++; break;
                case 'U' : count1[20] ++; break;
                case 'V' : count1[21] ++; break;
                case 'W' : count1[22] ++; break;
                case 'X' : count1[23] ++; break;
                case 'Y' : count1[24] ++; break;
                case 'Z' : count1[25] ++; break;    
            }
         }
        
        for(int i = 0; i < arr2.length; i++) {
            switch(arr2[i]) {
                case 'A' : count2[0] ++; break;
                case 'B' : count2[1] ++; break;
                case 'C' : count2[2] ++; break; 
                case 'D' : count2[3] ++; break;
                case 'E' : count2[4] ++; break;
                case 'F' : count2[5] ++; break;
                case 'G' : count2[6] ++; break;
                case 'H' : count2[7] ++; break;
                case 'I' : count2[8] ++; break;
                case 'J' : count2[9] ++; break;
                case 'K' : count2[10] ++; break;
                case 'L' : count2[11] ++; break;
                case 'M' : count2[12] ++; break;
                case 'N' : count2[13] ++; break;
                case 'O' : count2[14] ++; break;
                case 'P' : count2[15] ++; break;
                case 'Q' : count2[16] ++; break;
                case 'R' : count2[17] ++; break;
                case 'S' : count2[18] ++; break;                    
                case 'T' : count2[19] ++; break;
                case 'U' : count2[20] ++; break;
                case 'V' : count2[21] ++; break;
                case 'W' : count2[22] ++; break;
                case 'X' : count2[23] ++; break;
                case 'Y' : count2[24] ++; break;
                case 'Z' : count2[25] ++; break;    
            }
         }
        
        boolean flag = false;
        for(int i = 0; i < count1.length; i++) {
            if(count1[i] != count2[i]) {
                flag = false;
                break;
            }
            flag = true;
        }
        
       return flag;
    }