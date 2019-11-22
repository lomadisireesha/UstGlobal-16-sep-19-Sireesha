import java.util.Scanner;
class Rev
{
     public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num");
        int n=sc.nextInt();
        int  rev=0;
        int t=n;
        do{
              int r=t%10;
              rev=rev*10+r;
              t=t/10;
            }
        while(t!=0);
         
            System.out.println("reverse of" + n +"is" + rev);
     }
}