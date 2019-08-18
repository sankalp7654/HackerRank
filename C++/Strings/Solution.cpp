/**  
* @author SANKALP SAXENA  
*/

#include <iostream>
#include <string>
using namespace std;

int main() {
	// Complete the program
    string a, b;
    cin >> a >> b;
    
    int a_length = a.length();
    int b_length = b.length();
    
    cout << a_length << " " << b_length << endl << a + b << endl;
    
    char ch = a[0];
    char dh = b[0];
   
    cout << dh + a.substr(1) << " " << ch + b.substr(1);
    
    return 0;
}