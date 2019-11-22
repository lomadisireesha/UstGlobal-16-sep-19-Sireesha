import java.util.Scanner;
class Day
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in); 
  System.out.println("Enter num");
  int n =sc.nextInt();
  if(n==1)
        System.out.println("sun");
 else if(n==2)
       System.out.println(" mon"); 
 else if(n==3)
       System.out.println(" tue"); 
 else if(n==4)
       System.out.println(" wed"); 
 else if(n==5)
       System.out.println(" thur"); 
 else if(n==6)
       System.out.println(" fri"); 
 else if(n==7)
       System.out.println(" sat"); 
else
       System.out.println(" not a valid");
}
}