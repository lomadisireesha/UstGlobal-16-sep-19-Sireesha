import java.util.Scanner;
class ArrayOperation4
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
 int[] insertArr(int a[],int b[],int in)
{
    if(in<0||in>a.length)
     {
         System.out.println("index is out of range");
	return a;
     }
  	  int na[]=new int[a.length+b.length];
	  for(int i=0;i<b.length;i++)
	  {
		na[in+i]=b[i];
	 }
	for(int i=0;i<a.length;i++)
	{
		if(i<in)
		na[i]=a[i];
		else
		na[i+b.length]=a[i];
	}
		return na;		
}
}



















	
