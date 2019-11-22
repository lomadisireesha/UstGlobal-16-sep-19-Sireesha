import java.util.Scanner;
class MainArray4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.ot.println("Enter the how many u have");
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Entered array Elements");
		int pro=1;
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]+" ");
			pro=pro*ar[i];
		}
			System.out.println();
			System.out.println("Product is"+pro);
	}
}
		 
		