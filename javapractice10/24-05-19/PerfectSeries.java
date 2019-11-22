import java.util.Scanner;
class PerfectSeries
{ 
 static boolean isPerfect(int n)
  {
        int  i=1,t=n;
        int sum=0;
        while(i<=n/2)
            {
                if(n%i==0)
                 sum=sum+i;
                 i++;
            }
               if(sum==n)          
                  return true;
               else
                 return false;
    }
     public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num");
        int m=sc.nextInt();
        int n=sc.nextInt();
        for(int m=1;m<=1000;m++)
        {
          if(isPerfect(m))
          System.out.println(m);
          }
        }
    
      } 
}
        
     