/**  
* @author SANKALP SAXENA  
*/

#include <stdio.h>

void update(int *a,int *b) {
    // Complete this function
    int aa = *a;
    int bb = *b;
    *a = *a + *b;
    int x = (aa - bb);
    if(x < 0)
        *b = -x;
    else
        *b = x;
}

int main() {
    int a, b;
    int *pa = &a, *pb = &b;
    
    scanf("%d %d", &a, &b);
    update(pa, pb);
    printf("%d\n%d", a, b);

    return 0;
}