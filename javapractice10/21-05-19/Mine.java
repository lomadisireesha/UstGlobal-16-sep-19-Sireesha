import java.util.Scanner;
class Mine
{
public static void main(String arg[])
{
Scanner kb= new Scanner(System.in);
System.out.println("Hii"+"what is your name?");
String w=kb.next();
System.out.println("Hello"+w+"How old are you?");
byte a=kb.nextByte();
System.out.println(w+"your age was"+(a-5)+"five year back and it will be"+(a+5)+"after five years" );
}
}
