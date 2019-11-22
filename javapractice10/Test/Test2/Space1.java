import java.util.Scanner;
class Space1
{
	  public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int cofe=1;
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j==0||i==0)
				cofe=1;
				else 
				cofe=cofe*(i-j+1)/j;
				System.out.print(cofe);
			}
				System.out.println();
		}
	}
}