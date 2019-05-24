/**  
* @author SANKALP SAXENA  
*/

/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
int CompareLists(Node *headA, Node* headB)
{
  // This is a "method-only" submission. 
  // You only need to complete this method 
    
    Node *temp1 = headA;
    Node *temp2 = headB;
    
    int flag = 0, count =0;
    
    while((temp1 != NULL) && (temp2 != NULL))
    {
        count ++;
        if((temp1->data) == (temp2->data)) 
        {
            flag++;
        }
        temp1 = temp1->next;
        temp2 = temp2->next;
    }
    
    if((count == flag) && ((temp1) == NULL) && ((temp2) == NULL))
       return 1;
    
    
   return 0;
    
}
