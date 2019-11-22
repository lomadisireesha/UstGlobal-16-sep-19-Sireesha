import java.util.Scanner;
class Rectangle
{
public static void main(String arg[])
{
Scanner kb= new Scanner(System.in);
System.out.println("Enter  l value:");
float l= kb.nextFloat();
System.out.println("Enter  b value:");
float b= kb.nextFloat();
float r=l*b;
System.out.println("area:"+r);
}
}
