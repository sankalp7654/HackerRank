/**  
* @author SANKALP SAXENA  
*/

/*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element  
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
Node* Reverse(Node *head)
{
  // Complete this method
    
    if(head == NULL)
    {
        return NULL;
    }
        
    
    Node *temp = head;
    int count = 0;
    
    while(temp != NULL)
    {
          count ++;
        temp = temp->next;
      
    }
    
    temp = head;
    int a[count];
    
    for(int i = 0 ; i<=count-1 ; i++)
    {
        a[i] = temp->data;
        temp = temp->next;
     
    }
    
    Node *newnode = NULL, *present = NULL;
    for(int i = count-1 ; i>=0 ; i--)
    {
        
        newnode = (Node*)malloc(sizeof(Node));
        newnode->data = a[i];
        if(i == count-1)
        {
            present = temp = newnode;
            newnode->next = NULL;
        }    
        else
        {
            present->next = newnode;
            newnode->next = NULL;
            present = present->next;
        }
        
        
    }

    return temp;
    
    
}
