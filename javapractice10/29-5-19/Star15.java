import java.util.Scanner;
class Star15
{
	public static void main(String[]  args)
	{
		Scanner sc=new Scanner(System.in);
		System.out .println("Enter the n value");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)// print n lines
		{
			for(int j=1;j<=i;j++)
			{
				System.out .print((char)(i+64));
				
				
			}
			System.out .println( );
			
		}
	}
}