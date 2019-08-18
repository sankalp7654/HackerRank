/**  
* @author SANKALP SAXENA  
*/

/*
  Delete Node at a given position in a linked list 
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
Node* Delete(Node *head, int position)
{
  // Complete this method
    
    Node *temp = head;
    Node *present = head;
    int i = 0;
    
    
    if(position == 0 )
    {
        temp = temp->next;
        delete[] (present);
        return temp;
    }
    
    for( ; i<position-1 ; i++)
    {
        temp = temp->next;
    }
    
    present = temp->next;
    temp->next = temp->next->next;
    delete[] (present);
    return head;
    
}
