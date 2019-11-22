import java.util.Scanner;
class Middle
{
     public static void main(String args[])
{
       Scanner sc=new Scanner(System.in);
        System.out.println("enter 3 numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a<b&&b<c)
          System.out.println(b+" is middle");
       else if (b<a&&a<c)
           System.out.println(a+" is middle");
        else
            System.out.println(c+" is middle"); 
}
}