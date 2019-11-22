import java.util.Scanner;
class MainStr4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		int count[]=new int[128];
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			count[ch]++;
		}
		for(int i=0;i<count.length;i++)
		{
			if(count[i]>0)
			System.out.println((char)i+"--->"+count[i]);
		}
	}
}