#include <iostream>

using namespace std;

int main()
{ 
    int num1=600851475143;
   for (int i = 2; i <= num1; i++)
   { if (num1 % i == 0) 
   { 
       num1=num1/ i;
       i--; 
       
   }}
cout<<i;

}
