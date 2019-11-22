import java.util.Scanner;
class Perfect
{
     public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num");
        int n=sc.nextInt();
        int  i=1;
        int sum=0;
        while(i<=n/2)
            {
                if(n%i==0)
                 sum=sum+i;
                 i++;
            }
         if(sum==n)            
            System.out.println("perfect num");
         else
           System.out.println("not a perfect num");
     }
}