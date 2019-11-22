import java.util.Scanner;
class EvenNum1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int n=sc.nextInt();
if(n%2==0)
{
System.out.println(" num is even:"+n);
}
else
{
System.out.println(" num is odd:"+n);
}
}
}