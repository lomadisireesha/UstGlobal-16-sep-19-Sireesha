import java.util.Scanner;
class EvenNum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int n=sc.nextInt();
if(n/2*2==n)
{
System.out.println(" num is even:"+n);
}
else
{
System.out.println(" num is odd:"+n);
}
}
}