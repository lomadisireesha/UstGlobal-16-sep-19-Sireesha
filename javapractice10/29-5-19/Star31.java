import java.util.Scanner;
class Star31
{
	public static void main(String[]  args)
	{
		Scanner sc=new Scanner(System.in);
		System.out .println("Enter the n value");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)// print n lines
		{
			for(int k=1;k<n-i;k++)//spaces
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)//star printing
			{
				System.out .print(j);
			}
			System.out .println( );
			
		}
	}
}