import java.util.Scanner;
class Star69
 {
	public static void main(String[]  args)
	{
		Scanner sc=new Scanner(System.in);
		int n=7;
		for(int i=0;i<n;i++)// print n lines
		{
			for(int j=0;j<n;j++)//star printing

			{
				if(i==0||i==n-1||j==0||j==n-1||i==n/2||j==n/2)
					System.out .print("*");
				else
					
					System.out .print(" ");
			}	
				System.out .println( );
			
	                  }	
                  }
}