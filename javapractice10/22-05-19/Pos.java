import java.util.Scanner;
class Pos
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter  number");
int n=sc.nextInt();
String st=(n>=0)? "positive": "negative" ;
System.out.println(n +" num is "+st);
}
}