import java.util.Scanner;
class EvenNummm
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int n=sc.nextInt();
String st=(n%2==0)?"even":"odd";
 System.out.println(n+"is"+st);
}
}