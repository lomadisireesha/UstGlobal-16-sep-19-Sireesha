class  MainArr8
{
    public static void main(String[] args)
     {
	ArrayOperation7 ao=new ArrayOperation7();
         	System.out.println("Enter how many numbers you want");
	int a[]=ao.readArr();
	int n=a.length;
	for(int i=0;i<n;i++)
	{
		int count=1;
		for(int j=i+1;j<n;j++)
		{
			if(a[i]==a[j])
			{
				count++;
				a[j]=a[n-1];
				n--;
				j--;
			}
		}
	     System.out.println(a[i]+"--->"+count);
	}
}	
}