import java.util.Scanner;
class Fact1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of n");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
fact(i);
}
static void fact(int n)
{
int f=1;
for(int i=1;i<=n;i++)
{
f=f*i;
}
System.out.println(f);
}
}
