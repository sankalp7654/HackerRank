/**  
* @author SANKALP SAXENA  
*/

    public static  Node insert(Node head,int data) {
        //Complete this method
        Node newNode = new Node(data);
              
        Node temp = head;
        
        if(temp == null)
            head = newNode;
        
        else {
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        
        return head;
        
    }