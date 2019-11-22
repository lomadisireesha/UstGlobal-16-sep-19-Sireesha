import java.util.Scanner;
class Marks
{
public static void main(String args[])
{
       Scanner sc=new Scanner(System.in); 
       System.out.println("Enter 4 marks");
       int n1 =sc.nextInt();
       int n2 =sc.nextInt();
       int n3=sc.nextInt();
       int n4 =sc.nextInt(); 
       int  m=n1+n2+n3+n4;
      if(n1<35||n2<35||n3<35||n4<35)
           System.out.println("fail");
      else
            {  
               double per=(n1+n2+n3+n4)/4.0;
              if(per>=85)
             System.out.println("Distiction");
     else if (per>60)
             System.out.println("First class");
     else if (per>50)
             System.out.println("Second  class");
      else if (per>35)
             System.out.println("pass");
            }
} 
}
