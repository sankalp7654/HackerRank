/**  
* @author SANKALP SAXENA  
*/

/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
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
    
    while((temp->next) != NULL)
    {
        temp = temp->next;
    }
        newnode = (Node*)malloc(sizeof(Node));
        newnode->data = data;
        temp->next = newnode; 
        newnode->next = NULL;
        return head;
   
    
}
