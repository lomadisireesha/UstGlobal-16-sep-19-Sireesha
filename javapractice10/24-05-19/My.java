import java.util.Scanner;
class My
{
     public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name");
        String st=sc.next();
        System.out.println("enter num");
        int n=sc.nextInt();
       for(int i=1;i<=n;i++)  
            System.out.println(st);
     }
}