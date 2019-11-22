import java.util.Scanner;
class Prime
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter num");
    int n=sc.nextInt();
    int i=2;
   while(i<=n/2)
    {
      if(n%i==0)
       {
          System.out.println(n+"is not a prime num");
          return;
       }
     i++;
   {
        System.out.println(n+"is a prime num");
   }
   }
}
}
