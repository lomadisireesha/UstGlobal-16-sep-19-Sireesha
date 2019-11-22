import java.util.Scanner;
class Star51
{
	public static void main(String[]  args)
	{
		Scanner sc=new Scanner(System.in);
		System.out .println("Enter the n value");
		int n=sc.nextInt();
		int z=n+2;
		for(int i=n;i>=1;i--)// print n lines
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out .print(" ");
			}
			for(int j=1;j<=z;j++)//star printing
			{
				System.out .print(z);
			}
				z=z-2;
				
			System.out .println( );
			
	                  }	
                  }
}