import java.util.Scanner;
class ArrayOperation7
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
   int[] inter(int x[] , int y[])
   {
                    int z[]=new int[x.length+y.length];
	int k=0;
	for(int i=0;i<x.length;i++)
	{
	        for(int j=0;j<y.length;j++)
	       {
		    if(x[i]==y[j])
		    {
			z[k++]=x[i];
			break;
		    }
	      }
	}
	int nu[]=new int[k];
	for(int i=0;i<k;i++)
	nu[i]=z[i];
	return nu;
   }
}	