package demo;
public class NewClass2
{
    public static void main(String args[])
{
    int low,sum=0;
    for(low=0;low<1000;low++)
     {
         if(low%3==0||low%5==0)
         {
             sum=sum+low;
         }
        
     } 
     System.out.println(sum);
    
}
}

