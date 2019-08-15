package demo;


public class NewClass5 {
    void sum()
    {       
    Long num1;
    int i;
    num1=600851475143L;
   for (i = 2; i <= num1; i++)
   { if (num1 % i == 0) 
   { 
       num1=num1/ i;
       i--; 
       
   }}
    System.out.println(i);

    
    
}

public static void main(String args[])
{
    NewClass5 obj=new NewClass5();
    obj.sum();
    
}
}