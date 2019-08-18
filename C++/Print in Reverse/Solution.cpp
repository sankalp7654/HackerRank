/**  
* @author SANKALP SAXENA  
*/

/*
  Print elements of a linked list in reverse order as standard output
  head pointer could be NULL as well for empty list
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
void ReversePrint(Node *head)
{
  // This is a "method-only" submission. 
  // You only need to complete this method. 
    
    int size = 0;
    Node *temp = head;
    
    if (head == NULL)
        return;
    
    while((temp->next)!=NULL)
    {
        size ++;
        temp = temp->next;
    } 
    size ++;
       
    
     temp = head;   
    int a[size-1], i = 0;
     while((temp->next)!=NULL)
    {
        a[i++] = temp->data;
        temp = temp->next;
    }
        a[i] = temp->data;
    
   
    for(i = size-1; i>=0 ;i--)
        cout<<a[i]<<"\n";
    
    
     
}
