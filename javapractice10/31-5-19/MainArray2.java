class MainArray2
{
	public static void main(String[] args)
	{
	  	  int ar[];//declaration
		  ar=new int[]{56,45,78,25,64};//intiallization
		  int sum=0;
		for(int i=0;i<ar.length;i++)
		{
			sum=sum+ar[i];
		}
		System.out.println("Sum Of Array element is"+sum);
		System.out.println("Avg Of Array element is"+sum/ar.length);
	}
}
		 
		