/**  
* @author SANKALP SAXENA  
*/

//Write your code here

    
    TreeSet<String> treeSet = new TreeSet<String>();
   
    for(int i= 0; i < t; i++) {
       
        
        String str = pair_left[i] + " " + pair_right[i];
        
        treeSet.add(str);
        System.out.println(treeSet.size());
        
       
    }
