/**  
* @author SANKALP SAXENA  
*/

    public static Node removeDuplicates(Node head) {
        
        if(head == null)
            return null;
        
        if(head.next == null)
            return head;
        
        Node temp = head.next, previous = head;

        while(temp != null)  {
            while(previous.data == temp.data) {
                previous.next = temp.next;
                if(temp.next == null)
                    break;
                temp = temp.next; 
            } 
            previous = previous.next;
            temp = temp.next;
        }
        return head;
    }