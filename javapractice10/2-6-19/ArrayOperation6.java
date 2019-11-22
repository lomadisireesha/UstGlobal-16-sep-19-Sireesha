import java.util.Scanner;
class ArrayOperation6
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
   int[] union(int x[] , int y[])
   {
                    int z[]=new int[x.length+y.length];
	for(int i=0;i<x.length;i++)
	{
		z[i]=x[i];
	}
	int k=x.length;
	for(int i=0;i<y.length;i++)
	{
		boolean find=true;
		for(int j=0;j<x.length;j++)
		{
		    if(y[i]==x[j])
		    {
			find=false;
			break;
		    }
		}
		if(find)
		z[k++]=y[i];
	}
	int nu[]=new int[k];
	for(int i=0;i<k;i++)
	nu[i]=z[i];
	return nu;
   }
}	