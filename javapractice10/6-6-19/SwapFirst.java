import java.util.Scanner;
class SwapFirst
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  String");
		String s1=sc.nextLine();
		String rs=" ";
		char ch[]=s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
		if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ' )
		{
			int j=i;
		while(i<ch.length&&ch[i]!=' ')
		{
			i++;
		}
		char t=ch[i-1];
		ch[i-1]=ch[j];
		ch[j]=t;
		}
		}
		s1=new String(ch);
		System.out.println(s1);
	}
}