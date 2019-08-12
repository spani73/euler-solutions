#include <iostream>

using namespace std;

int main()
{
    int low,sum=0;
    for(low=0;low<1000;low++)
     {
         if(low%3==0||low%5==0)
         {
             sum=sum+low;
         }
        
     } 
     cout<<sum;
     return 0;
}