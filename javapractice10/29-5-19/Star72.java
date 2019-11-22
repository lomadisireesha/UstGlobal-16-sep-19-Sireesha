import java.util.Scanner;
class Star72
 {
	public static void main(String[]  args)
	{
		Scanner sc=new Scanner(System.in);
		int n=4;
		for(int i=0;i<n;i++)// print n lines
		{
			for(int k=1;k<=n-i;k++)
				System.out .print(" ");
				int k=1;
			for(int j=0;j<=i;j++)//star printing

			{
				System.out .print(k+" ");
				k=k*(i-j)/(j+1);
			}
				System.out .println( );
	                  }	
                  }
}