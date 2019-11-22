import java.util.Scanner;
class Circle
{
public static void main(String arg[])
{
Scanner kb= new Scanner(System.in);
System.out.println("Enter value:");
float r= kb.nextFloat();
final float PI=3.14f;
float a=PI*r*r;
System.out.println("area:"+a);
float c=2*PI*r;
System.out.println("circumference:"+c);
}
}
