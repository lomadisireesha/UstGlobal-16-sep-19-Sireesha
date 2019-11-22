import java.util.Scanner;
class Natural
{
     public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int  i=0,sum=0;
         while(i<=n)
           {
             sum=sum+i;
              i++;
           }
        System.out.println("first"+n+"number sum is:"+sum);
     }
}