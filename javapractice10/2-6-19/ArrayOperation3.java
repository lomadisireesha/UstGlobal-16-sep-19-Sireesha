import java.util.Scanner;
class ArrayOperation3
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
  int[] deleteArr(int x[],int in)
  {
    if(in<0||in>x.length)
     {
	System.out.println("Index is not in range");
	return x;
     }
	int na[]=new int[x.length-1];
	for(int i=0;i<x.length-1;i++)
	{
		if(i<in)
		na[i]=x[i];
		else
		na[i]=x[i+1];
	}
		return na;
   }
}



















	
