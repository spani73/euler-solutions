package demo;


class NewClass2
{
    public static void main(String args[])
{
   
 int b=100,a=0,c=0;
while((500000-1000*b)%(1000-b)!=0)
     {
       a=(int)((500000-1000*b)/(1000-b));
        b=b+1;
            
     }            
c=1000-a-b;
System.out.println(a*b*c);

}
}
