import java.util.Scanner;
class EvenNumm
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int n=sc.nextInt();
switch(n%2)
{
 case 0: System.out.println(" num is even:"+n);
               break;
case 1:  System.out.println(" num is odd:"+n);
}
}
}