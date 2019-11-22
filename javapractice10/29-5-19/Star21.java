import java.util.Scanner;
class Star21
{
	public static void main(String[]  args)
	{
		Scanner sc=new Scanner(System.in);
		System.out .println("Enter the n value");
		int n=sc.nextInt();
		int k=1;
		for(int i=1;i<=n;i++)// print n lines
		{
		   
			for(int j=n;j>=i;j--)
			{
				System.out .print( k%2+" ");
				k++;
				
				
			}
			System.out .println( );
			
		}
	}
}