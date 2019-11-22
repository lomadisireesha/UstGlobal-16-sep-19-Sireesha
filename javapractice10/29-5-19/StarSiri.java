import java.util.Scanner;
class Starsiri
{
	public static void main(String[]  args)
	{
		Scanner sc=new Scanner(System.in);
		int n=5,sp=n-1,ele=1;
		for(int i=1;i<=n;i++)// print n lines
		{
			for(int k=1;k<=sp;k++)
			{
				System.out .print(" ");
			}
				int k=1;
			for(int j=0;j<ele;j++)//star printing
			{
				System.out .print(k++);
				if(j==ele/2)
			                   k=1;
			
			}
				sp--;
				ele=ele+2;	
				System.out .println( );
			
	                  }	
                  }
}