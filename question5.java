package demo;


class NewClass2{

void small() 
{
    int num =20;
    int small=20;
   do
    {
        for(int i=1;i<=20;i++)
        {
            if(num%i!=0)
            {
                small=20;
                break;
                
            }
            else
            {
                small=num;
            }
        }
        num++;
    }
   while(small==20);
          
            
           
    System.out.println(small);
  
}
public static void main(String args[])
{
    NewClass2 obj=new NewClass2();
    obj.small();
    
}
}