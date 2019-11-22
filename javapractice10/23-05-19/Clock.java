import java.util.Scanner;
class Clock
{
     public static void main(String args[])
{
       Scanner sc=new Scanner(System.in);
        System.out.println("enter hour & min");
        int hr=sc.nextInt();
        int min=sc.nextInt();
        double mangle=min*6;
        double  hangle=hr*30+min*0.5;
         double angle=0.0;
       if(hangle>mangle)
          angle=hangle-mangle;
       else
          angle=mangle-hangle;
       if(angle>180)
           angle=360-angle;
      System.out.println(angle+ " is least num");
}
}
