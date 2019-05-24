/**  
* @author SANKALP SAXENA  
*/

/*
  Insert Node at the begining of a linked list
  Initially head pointer argument could be NULL for empty list
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
return back the pointer to the head of the linked list in the below method.
*/
Node* Insert(Node *head,int data)
{
  // Complete this method
    
    Node *temp = head;
    Node *newnode = NULL;
    
    if(head == NULL)
    {
        temp = (Node*)malloc(sizeof(Node));
        temp->data = data;
        temp->next = NULL;
        return temp;
    }
    
    newnode = (Node*)malloc(sizeof(Node));
    newnode->data = data;
    newnode->next = temp;
    return newnode;
    
    
}
