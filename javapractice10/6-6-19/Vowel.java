import java.util.Scanner;
class Vowel
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  String");
		String s1=sc.nextLine();
		String rs=" AEIOUaeiou";
		char ch[]=s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
		if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ' )
		{
			if(rs.contains(ch[i]+""))
			{
			while(i<ch.length&&ch[i]!=' ')
			{
			 System.out.print(ch[i]);	
			 i++;
			}
			System.out.println();
			}
		}
		}
		
		
	}
} 