import java.util.Scanner;
class MainSpecial
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int n=sc.nextInt();
int d1=n/10;
int d2=n%10;
int sum=d1+d2+d1*d2;
if(sum==n)
{
System.out.println("special two digit num is:"+n);
}
else
{
System.out.println(" not special two digit num is:"+n);
}
}
}