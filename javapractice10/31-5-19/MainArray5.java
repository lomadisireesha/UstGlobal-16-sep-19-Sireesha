import java.util.Scanner;
class MainArray5
{
	static int getBiggest(int []a)
	{
		int big=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>big)
			big=a[i];
		}
			return big;
	}
                    static int getSmallest(int []a)
	{
		int small=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<small)
			small=a[i];
		}
			return small;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int ar[]={56,42,12,86};
		int bg=getBiggest(ar);
		System.out.println("the biggest number is"+bg);
		int sl=getSmallest(ar);
		System.out.println("the smallest number is"+sl);
	}
}
				