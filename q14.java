package demo;
	public class demo
	{	
	    public static void main(String args[])
	{
	   
	    	 
	    	long large = 0;
	    	long largen = 0;
	    	long num;
	    	 
	    	for (int i = 2; i <= 1000000; i++)
	    	{
	    	    int ctr = 1;
	    	    num = i;
	    	    while (num != 1)
	    	    {
	    	        if ((num % 2) == 0)
	    	        {
	    	            num = num / 2;
	    	        } else {
	    	            num = num * 3 + 1;
	    	        }
	    	        ctr++;
	    	    }
	    	 
	    	    
	    	    if (ctr > large) 
	    	    {
	    	        large = ctr;
	    	        largen = i;
	    	    }
	    	}
	    System.out.println(largen)   ;   
	        
	}
	         
	}

