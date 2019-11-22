import java.util.Scanner;
class Count
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  String1");
		System.out.println("enter the  String2");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int c=isSubStr(s1,s2);
		System.out.println(c);
	}
		static int isSubStr(String s1,String s2)
		{
			char c1[]=s1.toCharArray();
			char c2[]=s2.toCharArray();
			for(int i=0;i<c1.length;i++)
			{
				if(c1[i]==c2[0])
				{
				int k=i;
				int j=0;
				while(k<c1.length && j<c2.length && c1[k]==c2[j])
				{
					k++;
					j++;

				}
				if(j==s2.length())
				}
			}
				return count;
			
		}
}
			