/**  
* @author SANKALP SAXENA  
*/

/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
Node* InsertNth(Node *head, int data, int position)
{
  // Complete this method only
  // Do not write main function. 
    
    Node *temp = head;
    Node *newnode = NULL;
    int i =0;
  
    
    if(position == 0)
    {
        newnode = (Node*)malloc(sizeof(Node));
        newnode->data = data;
        newnode->next = temp;
        return newnode;
    }
     
    for( ; i<position-1 ; i++)
    {
        temp = temp->next;
    }
    
    newnode = (Node*)malloc(sizeof(Node));
    newnode->data = data;
    newnode->next = temp->next;
    temp->next = newnode;
    return head;
    
    
    
}
