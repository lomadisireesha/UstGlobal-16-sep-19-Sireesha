import java.util.Scanner;
class Star67
{
	public static void main(String[]  args)
	{
		Scanner sc=new Scanner(System.in);
		int n=7,sp=n/2,ele=1,z=1;
		for(int i=1;i<=n;i++)// print n lines
		{
			for(int j=1;j<=sp;j++)
				System.out .print(" ");
			for(int j=1;j<=ele;j++)//star printing

			{
					System.out .print(z%2);
					z++;
			}	
			
				if(i<=n/2)
				{
					sp--;
					ele=ele+2;
					
				}
				else
				{	
					sp++;
					ele=ele-2;				
				}
				System.out .println( );
			
	                  }	
                  }
}