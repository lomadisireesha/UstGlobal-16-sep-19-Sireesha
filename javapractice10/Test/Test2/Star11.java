import java.util.Scanner;
class Star11
{
	public static void main(String[]  args)
	{
		Scanner sc=new Scanner(System.in);
		int n=5,st=1,start=n/2;
		for(int i=1;i<=n;i++)
		{
			int k=start;
			for(int j=1;j<=st;j++)
				System.out .print("*");
				if(i<=n/2)
				{
					st++;
					start--;
				}
				else
				{
					st--;	
					start++;
				}
				System.out .println( );
			
	                  }	
                  }
}