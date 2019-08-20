
            
           
 public class NewClass 
{
public static int lcm(int c , int d)
   {
       int least=0;
       least=(c*d)/hcf(c,d);
        
       return least;
   }
 public static int hcf(int e,int f)
 {  while(e!=0)
 {
    int flag=e;
    e=f%e;
    f=flag;
    
 }   
 return f;
 }
public static void main(String args[])
{ int a=1;
  for(int i=2;i<20;i++)
  {
      a=lcm(a,i);
  }
  System.out.println(a);
    
}
}