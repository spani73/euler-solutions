public class NewClass
{          
  void primetot()
  {
   long s=2;
    	int i;
    	for(i=3;i< 2000000;i++)
    	{
    		if(Prime(i)==0)
    		{
    			s=s+i;
    		}
    	}
    	System.out.println(s);
  }
           int Prime(long n)
            {
        	       
        	        for (int i = 2; i < Math.sqrt(n) + 1; i++)
                        {
                            if (n % i == 0)
                            {
                                return 1;
                            }
                        }
        	        return 0;
        	    }
            
    
    public static void main(String[] args)
    {
    	NewClass obj = new NewClass();
        obj.primetot();
                
    }

}