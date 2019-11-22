import java.util.Scanner;
class Star55
{
	public static void main(String[]  args)
	{
		Scanner sc=new Scanner(System.in);
		int n=7,st=1;
		for(int i=1;i<=n;i++)// print n lines
		{
			int k=n/2;
			for(int j=1;j<=st;j++)//star printing
				System.out .print(k--);
				if(i<=n/2)
					st++;
				else
					st--;	
				System.out .println( );
			
	                  }	
                  }
}