import java.util.Scanner;
class Cel
{
public static void main(String arg[])
{
Scanner kb= new Scanner(System.in);
System.out.println("Enter  celcius value:");
float c1= kb.nextFloat();
float f1=c1*(9/5)+32;
System.out.println("fer:"+ f1);
}
}
