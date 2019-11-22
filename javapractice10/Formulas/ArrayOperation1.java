import java.util.Scanner;
class ArrayOperation1
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
   int[] mergeSort(int x[] , int y[])
   {
     	 int z[]=new int[x.length+y.length];
  	int i=0;
	int j=0;
	int k=0;
	while(i<x.length&&j<y.length)
	{
		if(x[i]<y[j])
   			z[k++]=x[i++];
		else
			z[k++]=y[j++];
	}
	while(i<x.length)
	{
		z[k++]=x[i++];
	}
	while(i<y.length)
	{
		z[k++]=y[j++];
	}
		return z;
   }    
}