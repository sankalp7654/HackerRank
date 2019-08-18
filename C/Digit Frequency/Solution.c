/**  
* @author SANKALP SAXENA  
*/

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
#define MAX_LIMIT 1000

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    char str[1000];
    fgets(str, MAX_LIMIT, stdin);
    int arr[10];
    for(int i = 0 ;  i  < 10; i++) {
        arr[i] = 0;
    }
    for(int i = 0; i < strlen(str); i++) {
        char ch = str[i];

        int num = ch;
        //printf("%d,", num);
        switch(num) {
            case 48 :    arr[0]++; break;
            case 49 :    arr[1]++; break;

            case 50 :    arr[2]++; break;

            case 51 :    arr[3]++; break;

            case 52 :    arr[4]++; break;

            case 53 :    arr[5]++; break;

            case 54 :    arr[6]++; break;

            case 55 :    arr[7]++; break;

            case 56 :    arr[8]++; break;
            case 57:
              arr[9]++;
              break;
        }
    }

    for(int i = 0; i <10; i++) {
        printf("%d ", arr[i]);
    }

    return 0;
}
