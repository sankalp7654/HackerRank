/**  
* @author SANKALP SAXENA  
*/

/*
  Remove all duplicate elements from a sorted linked list
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
Node* RemoveDuplicates(Node *head)
{
  // This is a "method-only" submission. 
  // You only need to complete this method. 
    
    if(head == NULL)
        return NULL;
    
    Node * temp = head;
    Node * present = head;
    Node * previous = head;
    
    while(present != NULL)
    {
        present = present->next;
        if((present!=NULL)){
             if(((present->data)==(previous->data)))
        {
            previous->next = present->next;
            present = present->next;
        }
        
            
        }
       previous = previous->next;
        
    }
    return temp;
    
}
