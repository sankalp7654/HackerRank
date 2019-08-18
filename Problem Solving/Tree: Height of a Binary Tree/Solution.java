/**  
* @author SANKALP SAXENA  
*/



	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static int height(Node root) {
      	// Write your code here.

          if(root == null) {
            return -1;
          }
          else {
              int ldepth = height(root.left);
              int rdepth = height(root.right);
              if(ldepth > rdepth)
                    return ldepth + 1;
                return rdepth + 1;
          }
    }

