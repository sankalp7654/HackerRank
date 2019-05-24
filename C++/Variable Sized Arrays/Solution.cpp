/**  
* @author SANKALP SAXENA  
*/

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n, k;
    cin >> n >> k;
    int *arr[n];

    for(int i = 0; i < n; i++) {
        int c;
        cin >> c;
        arr[i] = new int[c];
        
        for(int j = 0; j < c; j++) {
            cin >> *(arr[i] + j);
        }
     }

    int row = 0, col = 0;
     for(int i = 0; i < k; i ++) {
         cin >> row >> col;

         cout << *(arr[row] + col) << endl;
     }


    return 0;
}

