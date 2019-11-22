class Specific
{
  int countOccurance(int a[] , int ele)
  {
	int count=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==ele)
		count++;
	}
		return count;
  }
public static void main(String[] args)
{	   
	int a[]={24,34,65,33,55,33};
	Specific s=new Specific();
	int c=s.countOccurance(a,33);
	System.out.println("occured"+c+"times");
}
}
	   	