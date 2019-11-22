import java.util.Scanner;
class Month12
{
     public static void main(String args[])
{
       Scanner sc=new Scanner(System.in);
        System.out.println("enter numbers");
        String st=sc.next();
       switch(st)
        {
          case a:  System.out.println("jan=31");
                         break;
         case b:  System.out.println("feb=28");
                         break;
         case c:  System.out.println("mar=31");
                         break;
         case d:  System.out.println("apr=30");
                         break;
         case e:  System.out.println("may=31");
                         break;
         case f:  System.out.println("jun=30");
                         break;
        case g:  System.out.println("july=31");
                         break;
        case h:  System.out.println("aug=31");
                         break;
        case i:  System.out.println("sep=30");
                         break;
        case j:  System.out.println("oct=31");
                         break;
        case k:  System.out.println("nov=30");
                         break;
        case l:  System.out.println("Dec=31");
                         break;
       default :  System.out.println("invalid ");
       }               
}
}