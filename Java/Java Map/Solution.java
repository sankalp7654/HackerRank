/**  
* @author SANKALP SAXENA  
*/

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
        
        TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		for(int i=0;i<n;i++)
		{
			String name=br.readLine();
			Integer phone=Integer.parseInt(br.readLine());
            //System.out.println(name +  " " + phone);
            treeMap.put(name, phone);

		}
        
        String s = null;
       // System.out.println(treeMap);
		while((s= br.readLine()) != null)
		{
	         try{
                int temp = treeMap.get(s);
                System.out.println(s+"="+temp);
             }catch(NullPointerException e){
                System.out.println("Not found");
             }    
        }
	}
}



