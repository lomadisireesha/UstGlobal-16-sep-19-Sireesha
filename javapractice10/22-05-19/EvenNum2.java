import java.util.Scanner;
class EvenNum2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String st[]={"even","odd"};
System.out.println("enter number");
int n=sc.nextInt();
System.out.println(n+"is"+st[n%2]+"number");
}
}
