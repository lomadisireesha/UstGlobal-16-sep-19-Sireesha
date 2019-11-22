import java.util.Scanner;
class Hun
{
   public static void main(String args[])
   {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter number");
          int n=sc.nextInt();
          int evencount=0, oddcount=0;
        // int a = 0,b=0;
   for(int i=0; i<=n; i++)
     {
        if(i%2==0)
         {
            evencount++;
         }
              
   else
        {
              oddcount++;
        }
    }
             System.out.println("evencount:" +evencount );
             System.out.println("oddcount:" +oddcount  );
  }
}