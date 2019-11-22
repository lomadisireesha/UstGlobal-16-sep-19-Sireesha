import java.util.Scanner;
class Month12
{
     public static void main(String args[])
{
       Scanner sc=new Scanner(System.in);
        System.out.println("enter month");
        String st=sc.next();
       switch(st)
        {
          case "jan":  System.out.println("31");
                         break;
         case "feb":  System.out.println("28");
                         break;
         case "mar":  System.out.println("31");
                         break;
         case "apr":  System.out.println("30");
                         break;
         case "may":  System.out.println("31");
                         break;
         case "jun":  System.out.println("30");
                         break;
        case "july":  System.out.println("31");
                         break;
        case "aug":  System.out.println("31");
                         break;
        case "sep":  System.out.println("30");
                         break;
        case "oct":  System.out.println("31");
                         break;
        case "nov":  System.out.println("30");
                         break;
        case "dec":  System.out.println("31");
                         break;
       default :  System.out.println("invalid ");
       }               
}
}