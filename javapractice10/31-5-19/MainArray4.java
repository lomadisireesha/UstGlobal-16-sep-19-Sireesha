import java.util.Scanner;
class MainArray4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the how many u have");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter the numbers");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		int pro=1;
		for(int i=0;i<ar.length;i++)
		{
			pro=pro*ar[i];
		}
			System.out.println();
			System.out.println("Product is"+pro);
	}
}
		 
		