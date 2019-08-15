package demo;


class NewClass2{

void difference() 
{  int n=100,sum1=0,sum2=0,diff=0; 
        sum1 =(n*(n+1))/2;
        sum2 =(n*(n+1)*(2*n+1))/6;
        diff=(sum1*sum1)-sum2;
   System.out.println(diff);
}

public static void main(String args[])
{
    NewClass2 obj=new NewClass2();
    obj.difference();
    
}
}