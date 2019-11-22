import java.util.Scanner;
class Month11
{
     public static void main(String args[])
{
       Scanner sc=new Scanner(System.in);
        System.out.println("enter numbers");
        int a=sc.nextInt();
       switch(a)
        {
          case 1:         
         case 3:             
         case 5:            
         case 7:    
         case 8:      
         case 10:  
         case 12:   System.out.println("31 days");
                          break;
        case 4:  
        case 6:  
        case 9: 
        case 11:  System.out.println("30 days");
                         break;
        case 2:  System.out.println("28  or 29days");
                         break;
       default :  System.out.println("invalid ");
       }               
}
}