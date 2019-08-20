class NewClass
{
public static int checkpallin(int n)
{int rem,rev=0;
    while(n!=0)
    {
        rem=n%10;
        rev=(rev*10)+rem;
        n=n/10;
    }
 return rev;   
}

public static void main(String args[])
{
    int max=0;
for(int i=999;i>100;i--)
{  
    for(int j=i;j>100;j--)
    {
        int num=i*j;
        if(checkpallin(num)==num && num>max)
        {
            max=i*j;
        }
            
    }
}
System.out.println(max);
}
