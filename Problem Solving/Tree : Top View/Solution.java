/**  
* @author SANKALP SAXENA  
*/



	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static void topView(Node root) {
    
        if(root != null) {
            System.out.print(root.data + " ");
                        topView(root.right);

        }
      
    }

