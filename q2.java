
package demo;


public class NewClass5 {
    void sum()
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
    System.out.println(sum);
}

public static void main(String args[])
{
    NewClass5 obj=new NewClass5();
    obj.sum();
    
}
}