import java.util.Scanner;
class Happy
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter num");
    int n=sc.nextInt();
     while(n>9)
      {
        int sum=0;
       do{
            int r=n%10;
            sum=sum+r*r;
            n=n/10;
           }
           while(n!=0);
            n=sum;
      }
     if(n==1||n==7)
       System.out.println("happy num");
    else
       System.out.println("not happy num");
     
}
}
