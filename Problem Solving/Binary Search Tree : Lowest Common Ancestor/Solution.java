/**  
* @author SANKALP SAXENA  
*/



	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static Node lca(Node root, int v1, int v2) {
        // To find the Lowest Common Ancestor
        // if the root node is less than v1 and v2 : Move to the right
        // if the root node is greater than v1 and v2 : Move to the left
        // if the root node is in between v1 and v2 : the node itself is the ancestor

        if((root.data >= v1) && (root.data <= v2)) {
            return root;
        }
        else if((root.data > v1) && (root.data > v2)) {
            root = root.left;
        }
        else if((root.data < v1) && (root.data < v2)) {
            root = root.right;
        }
        return root;
    }

