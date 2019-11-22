import java.util.Scanner;
class ArrayOperation
{
	int[] readArr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("how many values you want");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter"+n+"values");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
			return a;
	}
	void dispArr(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"  ");
		}
		System.out.println();
	}
	int[] sumEo(int a[])
	{
		int sum[]={0,0};
		for(int i=0;i<a.length;i++)
		{
		if(a[i]%2==0)
		sum[0]=sum[0]+a[i];
		else
		sum[1]=sum[1]+a[i];
		}
		return sum;
	}
}
class MainArray11
{
	 public static void main(String[] args)
	{
		ArrayOperation ao=new ArrayOperation();
		int a[]=ao.readArr();
		System.out.println("Array elements");
		ao.dispArr(a);
		int sum[]=ao.sumEo(a);
		System.out.println("sum of even numbers"+sum[0]);
		System.out.println("sum of odd numbers"+sum[1]);
	}
}