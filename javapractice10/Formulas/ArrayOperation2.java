import java.util.Scanner;
class ArrayOperation2
{
  int[] readArr()
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("how many values you have");
	int n=sc.nextInt();
	int ar[]=new int[n];
	System.out.println("Enter"+n+"values");
	for(int i=0;i<ar.length;i++)
	{
		ar[i]=sc.nextInt();
	}
		return ar;
    }
  void dispArr(int ar[])
   {
	 for(int i=0;i<ar.length;i++)
	{
		
	System.out.println(ar[i]+"  ");
	}
	
	System.out.println();
   }
   void mergeSort(int a[] , int n)
   {
	for(int i=0;i<a.length-1;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]+a[j]==10)
			System.out.println(a[i] +","+a[j]);
		}
	}
   }
}



















	
