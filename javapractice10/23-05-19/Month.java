import java.util.Scanner;
class Month
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in); 
  System.out.println("Enter month");
  int n =sc.nextInt();
  if(n==1)
        System.out.println("jan");
 else if(n==2)
       System.out.println(" feb"); 
 else if(n==3)
       System.out.println(" mar"); 
 else if(n==4)
       System.out.println(" april"); 
 else if(n==5)
       System.out.println(" may"); 
 else if(n==6)
       System.out.println(" june"); 
 else if(n==7)
       System.out.println(" july"); 
 else if(n==8)
       System.out.println(" aug"); 
  else if(n==9)
       System.out.println(" sep"); 
 else if(n==10)
       System.out.println(" oct"); 
 else if(n==11)
       System.out.println(" nov"); 
 else if(n==12)
       System.out.println(" Dec"); 
else
       System.out.println(" not a valid"); 


    
}
}