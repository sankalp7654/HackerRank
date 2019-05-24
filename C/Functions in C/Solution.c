/**  
* @author SANKALP SAXENA  
*/

#include <stdio.h>
/*
Add `int max_of_four(int a, int b, int c, int d)` here.
*/

int max_of_four(int a, int b, int c, int d) {
    int num1 = (a > b) ? a : b;
    int num2 = (c > d) ? c : d;
    int num = (num1 > num2) ? num1 : num2;
    return num;

}

int main() {
    int a, b, c, d;
    scanf("%d %d %d %d", &a, &b, &c, &d);
    int ans = max_of_four(a, b, c, d);
    printf("%d", ans);
    
    return 0;
}

