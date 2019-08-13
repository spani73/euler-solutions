package demo;
import java.lang.Math; 

class NewClass2
{
void number()
{
int num,ctr=2;
int b;
	for( num=3;ctr<=10001;num=num+2)
	{
		b=testPrime(num,3);
		
		if(b==1)
                {
                    ctr++;
                }	 
	}
        num=num-2;
        System.out.println(num);
}   
      int  testPrime(int value, int n) 
	{ 
	   
	    if (value % n == 0 && value!=n ) 
	        return 0; 
	    if (n>Math.sqrt(value)) 
	        return 1; 
	  
	    return testPrime(value, n + 2); 
	} 
        
        

public static void main(String args[])
{
    NewClass2 obj=new NewClass2();
    obj.number();
    
}
}