import java.util.Scanner;
class Star5
{
	public static void main(String[]  args)
	{
		Scanner sc=new Scanner(System.in);
		System.out .println("Enter the n value");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out .print((char)(i+65));
				
			}
			System.out .println( );
			
		}
	}
}