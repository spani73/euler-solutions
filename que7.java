


public class NewClass
{
 
 public static  int Prime(long n)
          {
	        
	        for (int i = 2; i < Math.sqrt(n) + 1; i++)
                { if (n % i == 0)
                       {   return 0;
                       }
                }
	        return 1;
	       }
	public static void main(String[] args)
	{
		
		long i, c=2,s=0;
		for(i=3;c<=10001;i++)
		{
			if(Prime(i)==1)
			{
				s=i;
				c++;
			}
		}
		System.out.println(s);
	}
}