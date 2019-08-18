/**  
* @author SANKALP SAXENA  
*/

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    char *s;
    s = malloc(1024 * sizeof(char));
    scanf("%[^\n]", s);
    s = realloc(s, strlen(s) + 1);
    //Write your logic to print the tokens of the sentence here.

    int i = 0;
    char ch = *(s);
    while(ch != '\0') {
        ch = *(s + i);
        i++;
        if(ch == '\0')
        break;
        if(ch == ' ')
        printf("\n");
        else
          printf("%c", ch);
    }
    return 0;
}

