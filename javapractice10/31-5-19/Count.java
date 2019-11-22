import java.util.Scanner;
class Count
{
	ArrayOperation ao=new ArrayOperation ();
	System.out.println("enter first element");
	int a[]=ao.readArr();
	int n=a.length;
	for(int i=0;i<n;i++)
	{
		int count=1;
	for(int j=i+1;j<n;j++)
	{
		if(a[i]==a[j])
		{
		count++;
		a[j]=a[n-1];
		n--;
		j--;
		}
	}
	System.out.println(a[i]+"-->"+count);
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


}
	   	