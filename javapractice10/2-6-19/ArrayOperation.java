import java.util.Scanner;
class ArrayOperation
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
   int[] zigZag(int x[] , int y[])
   {
     	 int z[]=new int[x.length+y.length];
  	int i=0;
	int j=0;
	while(i<x.length&&i<y.length)
	{
		z[j++]=x[i];
		z[j++]=y[i++];
	}
	while(i<x.length)
	{
		z[j++]=x[i++];
	}
	while(i<y.length)
	{
		z[j++]=y[i++];
	}
		return z;
   }    
}