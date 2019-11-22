import java.util.Scanner;
class Star7
{
	public static void main(String[]  args)
	{
		Scanner sc=new Scanner(System.in);
		System.out .println("Enter the n value");
		int n=sc.nextInt();
		for(int i=n;i>0;i--)
		{
			for(int j=n;j>0;j--)
			{
				System.out .print(j );
				
			}
			System.out .println( );
			
		}
	}
}