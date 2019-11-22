import java.util.Scanner;
class BMI
{
public static void main(String arg[])
{
Scanner kb= new Scanner(System.in);
System.out.println("enter weight");
float w=kb.nextFloat();
System.out.println("entered height");
float h=kb.nextFloat();
float bmi=w/(h*h);
System.out.println("Bmi is"+bmi);
}
}
