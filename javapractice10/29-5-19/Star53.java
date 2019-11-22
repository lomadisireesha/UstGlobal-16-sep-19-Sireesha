import java.util.Scanner;
class Star53
{
	public static void main(String[]  args)
	{
		Scanner sc=new Scanner(System.in);
		int n=5,sp=n-1,ele=1;
		for(int i=0;i<n;i++)// print n lines
		{
			for(int k=1;k<=sp;k++)
			{
				System.out .print(" ");
			}
				int k=i;
			for(int j=1;j<=ele;j++)//star printing
			{
				System.out .print((char)(k+65));
				if(j<=ele/2)
					k--;
				else
					k++;
			}
				sp--;
				ele=ele+2;	
				System.out .println( );
			
	                  }	
                  }
}