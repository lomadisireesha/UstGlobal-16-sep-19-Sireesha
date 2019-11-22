import java.util.Scanner;
class ArrayOperation9
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
   int[] minus(int x[],int y[])
   {
                    int z[]=new int[x.length];
	 int k=0;
	for(int i=0;i<x.length;i++)
	{
		boolean find=true;
		for(int j=0;j<y.length;j++)
		{
		    if(x[i]==y[j])
		    {
			find=false;
			break;
		    }
		}
		if(find)
		z[k++]=x[i];
	}
	int nu[]=new int[k];
	for(int i=0;i<k;i++)
	nu[i]=z[i];
	return nu;
   }
}	