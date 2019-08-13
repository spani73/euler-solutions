package demo;
import java.lang.Math;
public class NewClass5
{
 void prime()
 {
long add=2;
for(int i=3;i<2000000;i+=2)
{     
	if(testPrime(i,3)==1)
        {
		add=add+i;
        }	
}
 System.out.println(add);    
	   
}
int testPrime(int n, int j) 
{  
	
    if (n % j == 0 && n!=j) 
    { 
        return 0;
    }
    
    
    else if (j>(int)Math.sqrt(n))
    {
        return 1;
    } 
   j=j+2;
    return testPrime(n,j ); 
} 	
public static void main(String args[])
{
    NewClass5 obj=new NewClass5();
    obj.prime();
    
}
    
}   
    