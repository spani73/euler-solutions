public class NewClass
{
           public static boolean Prime(long n)
            {
        	       
        	        for (int i = 2; i < Math.sqrt(n) + 1; i++)
                        {
                            if (n % i == 0)
                            {
                                return false;
                            }
                        }
        	        return true;
        	    }
            
    
    public static void main(String[] args)
    {
    	long s=2;
    	int i;
    	for(i=3;i< 2000000;i++)
    	{
    		if(Prime(i))
    		{
    			s=s+i;
    		}
    	}
    	System.out.println(s);
    }

}