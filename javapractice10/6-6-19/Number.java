import java.util.Scanner;
class Number
{
	static void nTow(int n,String st)
	{
	String one[]={"","one","Two","Three","four","five","six","seven","eight","nine","ten","eleven","tweleven","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
	String two[]={"","","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
	if(n<20)
	System.out.println(one[n]);
	else
	System.out.println(two[n/10]+one[n%10]);
	if(n!=0)
	System.out.println(st+" ");
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  number");
		int n=sc.nextInt();
		nTow(n/10000000,"crore");
		nTow(n/1000000%100,"lakh");
		nTow(n/1000%100,"thousand");
		nTow(n/100%10,"hundred");
		nTow(n%100," ");
	}
}
