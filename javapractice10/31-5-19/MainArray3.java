class MainArray3
{
	public static void main(String[] args)
	{
	  	  int ar[];//declaration
		  ar=new int[5];//allocation
		  ar[0]=43;
		  ar[1]=63;
		  ar[ar.length-1]=56;
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(i+"--->"+ar[i]);
		}
	}
}
		 
		