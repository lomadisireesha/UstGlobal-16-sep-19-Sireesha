import java.util.Scanner;
class Star71
 {
	public static void main(String[]  args)
	{
		Scanner sc=new Scanner(System.in);
		int n=7,sp=n/2,st=1;
		for(int i=1;i<=n;i++)// print n lines
		{
			for(int k=1;k<=sp;k++)
				System.out .print(" ");
				
			for(int j=1;j<=st;j++)//star printing

			{
				System.out .print( j);
				if(j!=st)
				System.out .print("*");
			}
				if(i<n/2)
				{
					sp--;
					st++;
				}
				else
				{
					sp++;
					st--;
				}	
				System.out .println( );
	                  }	
                  }
}