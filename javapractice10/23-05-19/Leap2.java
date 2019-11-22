import java.util.Scanner;
class Leap2
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in); 
  System.out.println("Enter year");
  int n =sc.nextInt();
String str=(n%400==0|| n%4==0&&n%100!=0)?"leap year":"not a leap year";  
        System.out.println(n+ " is "+str);   
}
}