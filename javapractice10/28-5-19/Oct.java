import java.util.Scanner;
class Oct
{
 static int binToDec(int bin)
{ 
		int dec=0,c=0;
		while(bin!=0)
		{
			int r=bin%10;
			dec=dec+r*pow(2,c++);
			bin=bin/10;
		}
			return dec;
}
static String decToOct(int dec)
  {
         String oct="";
   		 while(dec!=0)
		  {
   
  			  int r=dec%8;
 		                     oct=r+oct;
   			dec=dec/8;
		}
			return oct;
 }
static  int pow(int n,int p)
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
   Oct o=new Oct();
   System.out.println("enter num");
   int n1=sc.nextInt();
   System.out.println(o.binToDec(n1));
   int dec1=o.binToDec(n1);
   System.out.println(o.decToOct(dec1));
}
}
   
   
   
   