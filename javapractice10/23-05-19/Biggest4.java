import java.util.Scanner;
class Biggest4
{
     public static void main(String args[])
{
       Scanner sc=new Scanner(System.in);
        System.out.println("enter 4 numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
       int c=sc.nextInt();
       int d=sc.nextInt();
      if(a>b&&a>c&&a>d)
          System.out.println(a+" is biggest");
      else if(b>c&&b>d)
          System.out.println(b+"is biggest");
      else if(c>d)
          System.out.println(c+"is biggest");
      else 
          System.out.println(d+"is biggest");
}
}