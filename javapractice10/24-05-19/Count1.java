import java.util.Scanner;
class Count11
{
     public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num");
        int n=sc.nextInt();
        int  sum=0,count=0;
        for(int i=1;i<=n;i++)
        {
           if(n%3==0&&n%7==0)
         {
            count++;
        }
            System.out.println(count);
           
     }
}