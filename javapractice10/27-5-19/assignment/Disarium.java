import java.util.Scanner;
class Disarium
{ 
	static boolean isArmStrong(int n)
	{
  		int sum=0,t=n;
  		int d=countDigit(n);
 		do{
      			int r=n%10;
      			sum=sum+pow(r,d);
			d--;
      			n=n/10;
      		}while(n!=0);
     		return sum==t;
	}
	static int countDigit(int n)
	{
 		 int count=0;
   		do{
         			count++;
        			 n=n/10;
        		}while(n!=0);
    		return count;
	}
	static int pow(int n,int p)
	{
 		 int pw=1;
  		while(p>0)
   		{
    			 pw=pw*n;
    			 p--;
   		}
		return pw;
	}
	public static void main(String[] args)
	{
  		 Scanner sc=new Scanner(System.in);
  		 System.out.println("Enter the range");
  		 int m=sc.nextInt();
  		 int n=sc.nextInt();
  		 for(;m<=n;m++)
  		 {
      			  if(isArmStrong(m))
			{
       			 System.out.println(m);
			}
    		}
	}
}
