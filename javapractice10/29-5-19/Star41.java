import java.util.Scanner;
class Star41
{
	public static void main(String[]  args)
	{
		Scanner sc=new Scanner(System.in);
		System.out .println("Enter the n value");
		int n=sc.nextInt();
		int z=1;
		for(int i=1;i<=n;i++)// print n lines
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out .print(" ");
			}
			for(int j=1;j<=z;j++)//star printing
			{
				System.out .print(z);
			}
				z=z+2;
			System.out .println( );
			
		}
	}
}