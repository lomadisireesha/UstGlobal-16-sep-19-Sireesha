import java.util.Scanner;
class Star33
{
	public static void main(String[]  args)
	{
		Scanner sc=new Scanner(System.in);
		System.out .println("Enter the n value");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--)// print n lines
		{
			for(int j=1;j<=i;j++)//star printing
			{
				System.out .print("*");
			}
			System.out .println( );
			
		}
	}
}