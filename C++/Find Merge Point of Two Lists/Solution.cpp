/**  
* @author SANKALP SAXENA  
*/

/*
   Find merge point of two linked lists
   Node is defined as
   struct Node
   {
       int data;
       Node* next;
   }
*/
int FindMergeNode(Node *headA, Node *headB)
{
    // Complete this function
    // Do not write the main method. 
    
    Node *tempA=headA;
    Node *tempB=headB;
 
    while((tempA)!=NULL)
    {
        while((tempB)!=NULL)
        {
            if((tempA->data)==(tempB->data))
            {
                return (tempA->data);
            }
            tempB = tempB->next;
        }
        tempB = headB;
        tempA = tempA->next;
    }
    
    
 return 0;   
    
}
