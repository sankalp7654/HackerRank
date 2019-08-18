/**  
* @author SANKALP SAXENA  
*/



	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/

	public static void levelOrder(Node root) {
        if(root == null)
            return;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty()) {
            Node temp = q.poll();
            System.out.print(temp.data + " ");
            if(temp.left != null) {
                q.add(temp.left);
            }
            if(temp.right != null){
                q.add(temp.right);
            }
        }
       
    }

