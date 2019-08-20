public class NewClass {

public static void main(String args[])
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
}