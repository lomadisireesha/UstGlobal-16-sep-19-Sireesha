import java.util.Scanner;
class Star9
{
	public static void main(String[]  args)
	{
		Scanner sc=new Scanner(System.in);
		System.out .println("Enter the n value");
		int n=sc.nextInt();
		int k=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out .print(k%2 );
				k++;
				
			}
			System.out .println( );
			
		}
	}
}