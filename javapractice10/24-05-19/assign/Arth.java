import java.util.Scanner;
class Arth
{
     public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 num"); 
       int n1=sc.nextInt();
       int n2=sc.nextInt();
         int sum=n1+n2;
         int div=n1/n2;
         int mul=n1*n2;
         int min=n1-n2;
         int mou=n1%n2;
         System.out.println(sum);
         System.out.println(div);
         System.out.println(mul);
         System.out.println(min);
         System.out.println(mou);
     }
}