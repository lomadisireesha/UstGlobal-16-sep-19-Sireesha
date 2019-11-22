import java.util.Scanner;
class Product
{
     public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num");
        int n=sc.nextInt();
        int  i=1,sum=1;
        while(i<=n)
           {
              System.out.println(i);
              sum=sum*i;
               i++;
           }
            System.out.println(sum+"is product of  num ");
     }
}