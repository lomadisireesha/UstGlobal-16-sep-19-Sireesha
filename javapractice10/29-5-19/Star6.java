import java.util.Scanner;
class Star6
{
	public static void main(String[]  args)
	{
		Scanner sc=new Scanner(System.in);
		System.out .println("Enter the n value");
		int n=sc.nextInt();
		for(int i=n;i>0;i--)
		{
			for(int j=1;j<=n;j++)
			{
				System.out .print(i );
				
			}
			System.out .println( );
			
		}
	}
}