
public class NewClass {


public static void main(String args[])
{
    
    int c=0,a=1,b=1,i=1,sum=0;
    while(c<4000000)
    {   
        c=a+b;
        a=b;
        b=c;
        if(c%2==0)
        {
            sum=sum+c;
            
        }
        }
        
    
    System.out.println(sum);
}
}

