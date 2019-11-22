import java.util.Scanner;
class Weds
{
     public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num");
        int n=sc.nextInt();
        if(n%3==0&&n%5==0)
              System.out.println("sanju weds geetha");
        if (n%3==0)
            System.out.println("sanju");
        if(n%5==0)
             System.out.println("geetha");
        if(n%3!=0&&n%5!=0)
               System.out.println("breakup");
 
     }
}