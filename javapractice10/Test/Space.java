import java.util.Scanner;
class Space
{
	  public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
				if(i!=j)
				System.out.print(" ");
			}
				System.out.println();
		}
	}
}
/*  1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5*/