import java.util.Scanner;
class Vowel
{
     public static void main(String args[])
{
       Scanner sc=new Scanner(System.in);
        System.out.println("enter Alphabets");
        char ch=sc.next().charAt(0);
        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
          System.out.println(ch +"vowel");
        else
          System.out.println(ch +"Consonants");
}
}