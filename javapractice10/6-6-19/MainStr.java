import java.util.Scanner;
class MainStr
{
	 public static void main(String[] args)
	{
		 Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		int sum=getValues(s1);
		System.out.println(sum);
	}
	static int getValues(String s1)
	{
		int sum=0;
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch>='0'&&ch<='9')
			{
				sum=sum+ch-48;
			}
		}
			return sum;
	}
}

 