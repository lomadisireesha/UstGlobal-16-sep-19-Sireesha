import java.util.Scanner;
class Star61
{
	public static void main(String[]  args)
	{
		Scanner sc=new Scanner(System.in);
		int n=7,st=1,sp=n/2,start=n/2;;
		for(int i=1;i<=n;i++)// print n lines
		{
				int k=start;
			for(int j=1;j<=sp;j++)
				System.out .print(" ");
			for(int j=1;j<=st;j++)//star printing
				System.out .print(k++);
				if(i<=n/2)
				{
					st++;
					sp--;
					start++;
					
				}
				else
				{
					st--;	
					sp++;
					start--;


				
				}
				System.out .println( );
			
	                  }	
                  }
}