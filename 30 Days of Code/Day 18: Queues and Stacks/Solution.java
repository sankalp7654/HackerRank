/**  
* @author SANKALP SAXENA  
*/

public class Solution {
    // Write your code here.
    char [] queue = new char[100];
    char [] stack = new char[100];
    
    int front = 0, rear = -1, top = -1;
    
    void pushCharacter(char ch) {
        stack[++ top] = ch;    
    }
    
    void enqueueCharacter(char ch) {
        queue[++ rear] = ch;
    } 
    
    char popCharacter() {
        return stack[top --];
    }
    
    char dequeueCharacter() {
        return queue[front ++];
    }
    