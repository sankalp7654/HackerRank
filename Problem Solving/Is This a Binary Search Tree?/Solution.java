/**  
* @author SANKALP SAXENA  
*/

/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
    boolean checkBST(Node root) {
        
        // only one element is present in the BST
        if(root.left == null && root.right == null) {
            return true;
        }
        
        
        // for using BFS
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        Node leftChild = null, rightChild = null;
        
        while(!q.isEmpty()) {
            Node temp = q.poll();
            
            if(temp.left != null) {
                leftChild = temp.left;
                q.add(leftChild);
            }
            if(temp.right != null) {
                rightChild = temp.right;
                q.add(rightChild);
            }
            boolean status = checkUtils(temp, temp.left, temp.right);

            if(status == false)
                return false;
            
        }
        return true;
        
    }

    static boolean checkUtils(Node temp, Node leftChild, Node rightChild) {
        if((leftChild == null) && (rightChild == null))
            return true;
        
        if((rightChild == null) && (leftChild != null)) {
            if(leftChild.data < temp.data) {
                return true;
            }
            return false;
        }
        if((leftChild == null) && (rightChild != null)) {
            if(rightChild.data > temp.data) {
                return true;
            }
            return false;
        }
        if((leftChild.data < temp.data) && (temp.data > rightChild.data)) {
            return true;
        }
        return false;
    }