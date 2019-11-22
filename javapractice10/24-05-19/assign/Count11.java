import java.util.Scanner;
class Count11
{
     public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num");
        int n=sc.nextInt();
        int  count=0;
        int i=1;
        while(i<=n)
        {
           if(i%3==0&&i%7==0)
            count++;
             i++;
         }
            System.out.println(count);
 
     }
}