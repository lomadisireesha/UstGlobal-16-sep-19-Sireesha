import java.util.Scanner;
class Avg
{
public static void main(String arg[])
{
Scanner kb= new Scanner(System.in);
System.out.println("Enter  p1 value:");
float p1= kb.nextFloat();
System.out.println("Enter  p2 value:");
float p2= kb.nextFloat();
System.out.println("Enter  p3 value:");
float p3= kb.nextFloat();
float a=(p1+p2+p3)/3;
System.out.println("ave:"+a);
}
}
