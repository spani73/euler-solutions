public class NewClass
{
	     public static boolean Prime(long n)
          {
	        
	        for (int i = 2; i < Math.sqrt(n) + 1; i++)
                { if (n % i == 0)
                       {   return false;
                       }
                }
	        return true;
	       }
	
	void Primenum()
	{
		long i, c=2,s=0;
		for(i=3;c<=10001;i++)
		{
			if(Prime(i))
			{
				s=i;
				c++;
			}
		}
		System.out.println(s);
	}
	public static void main(String[] args)
	{
		NewClass obj=new NewClass();
                obj.Primenum();
	}
}