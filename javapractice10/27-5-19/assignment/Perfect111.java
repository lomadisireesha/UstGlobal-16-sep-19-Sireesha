import java.util.Scanner;
class Perfect111
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
        for(int m=1;m<=5000;m++)
        {
          if(isPerfect(m))
          System.out.println(m);
          }
        }
    
      } 

        
     