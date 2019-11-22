import java.util.Scanner;
class Discount
{
public static void main(String arg[])
{
Scanner kb= new Scanner(System.in);
System.out.println("Enter  p1 price:");
float p1= kb.nextFloat();
System.out.println("Enter  p2 price:");
float p2= kb.nextFloat();
System.out.println("Enter  p3 price:");
float p3= kb.nextFloat();
float a=p1*(0.92f);
float b=p2*(0.92f);
float c=p3*(0.92f);
System.out.println("p1 fin:"+a);
System.out.println("p2 fin:"+b);
System.out.println("p3 fin:"+c);

}
}
