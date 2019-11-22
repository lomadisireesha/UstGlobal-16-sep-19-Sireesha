import java.util.Scanner;
class Star8
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
				System.out .print((char)(j+64) );
				
			}
			System.out .println( );
			
		}
	}
}