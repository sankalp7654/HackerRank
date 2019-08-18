/**  
* @author SANKALP SAXENA  
*/

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <string.h>
using namespace std;

int main() 
{
    int n,i,q,j;
    cin>>n;
    string str[n];
    for(i=0;i<n;i++)
    {
        cin>>str[i];
    }
    cin>>q;
    string pat[q];
    for(i=0;i<q;i++)
    {
        cin>>pat[i];
    }
    for(i=0;i<q;i++)
    {
        int flag=0;
        for(j=0;j<n;j++)
        {
            if(pat[i]==str[j])
                flag++;
        }
        cout<<flag<<"\n";
    }
    return 0;
}