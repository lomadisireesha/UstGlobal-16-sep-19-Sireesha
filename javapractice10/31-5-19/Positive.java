class Positive
{
	public static void main(String[] args)
	{
		int a[]={25,-32,54,-42,05,6};
		int c[]=countEo(a);
		System.out.println("No.of positive number"+c[0]);
		System.out.println("No.of negative number"+c[1]);
	}
	static int[] countEo(int a[])
	{
		int count[]={0,0};
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=0)
			count[0]++;
			else
			count[1]++;
		}
		return count;
	}
}