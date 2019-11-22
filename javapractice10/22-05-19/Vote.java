import java.util.Scanner;
class Vote
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int n=sc.nextInt();
if(n>=18)
{
System.out.println(" person is eligible");
}
else
{
System.out.println(" person is not eligible");
}
}
}