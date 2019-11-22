import java.util.Scanner;
class Simple
{
public static void main(String arg[])
{
Scanner kb= new Scanner(System.in);
System.out.println("Enter  p value:");
float p= kb.nextFloat();
System.out.println("Enter  t value:");
float t= kb.nextFloat();
System.out.println("Enter  r value:");
float r= kb.nextFloat();
float si=(p*t*r)/100;
System.out.println("s.i:"+si);
}
}
