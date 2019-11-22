import java.util.Scanner;
class Arm
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter num");
    int n=sc.nextInt();
    int t=n;
    int sum=0;
       do{
            int r=n%10;
            sum=sum+r*r*r;
            n=n/10;
           }
           while(n!=0);
            n=sum;
     if(n==t)
       System.out.println("armstrong num");
    else
       System.out.println("not armstrong num");
     
}
}
