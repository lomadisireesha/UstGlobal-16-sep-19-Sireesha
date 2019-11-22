import java.util.Scanner;
class Star23
{
	public static void main(String[]  args)
	{
		Scanner sc=new Scanner(System.in);
		System.out .println("Enter the n value");
		int n=sc.nextInt();
		int k=1;
		for(int i=1;i<=n;i++)// print n lines
		{
		   
			for(int j=1;j<=i;j++)
			{
				System.out .print( k++ +" ");
				if(k==10)
				k=1;
				
				
			}
			System.out .println( );
			
		}
	}
}