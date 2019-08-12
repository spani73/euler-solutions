#include <iostream>

using namespace std;

int main()
{
    int c=0,a=1,b=1,i=1,sum=0;
    while(i!=0)
    {   if (c<4000000)
        {
        c=a+b;
        a=b;
        b=c;
        if(c%2==0)
        {
            sum=sum+c;
            
        }
        }
        else
        {
            break;
        }
        i++;
    }
    cout<<sum;
    return 0;
}
