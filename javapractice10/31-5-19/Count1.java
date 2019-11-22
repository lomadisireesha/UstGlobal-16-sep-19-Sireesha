class Count1
{
	public static void main(String[] args)
	{
		int a[]={25,32,54,42,05,6};
		int c[]=countEo(a);
		System.out.println("No.of even number"+c[0]);
		System.out.println("No.of odd number"+c[1]);
	}
	static int[] countEo(int a[])
	{
		int count[]={0,0};
		for(int i=0;i<a.length;i++)
		count[a[i]%2]++;
		return count;
	}
}