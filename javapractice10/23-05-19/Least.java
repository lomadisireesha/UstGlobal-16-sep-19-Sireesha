import java.util.Scanner;
class Least
{
     public static void main(String args[])
{
       Scanner sc=new Scanner(System.in);
        System.out.println("enter 3 numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int least=((a<b&&a<c))?a:(b<c)?b:c ;
          System.out.println(least+" is least num");
}
}