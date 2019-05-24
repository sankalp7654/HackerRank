/**  
* @author SANKALP SAXENA  
*/

#include <sstream>
#include <vector>
#include <iostream>
using namespace std;

vector<int> parseInts(string str) {
  stringstream ss(str);
  int a;
  vector<int> vec;

  while (ss >> a) {
    vec.push_back(a);

    if (ss.peek() == ',') {
      ss.ignore();
    }
  }

  return vec;
}

int main() {
    string str;
    cin >> str;
    vector<int> integers = parseInts(str);
    for(int i = 0; i < integers.size(); i++) {
        cout << integers[i] << "\n";
    }
    
    return 0;
}

