import java.util.Scanner;
class Str
{
	public static void main(String[] args)
	{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the sentence");
		 String st=sc.nextLine();
		 int vcount=0;
		 int ccount=0;
		 for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			 if(ch>=65&&ch<=90||ch>=97&&ch<=122)
			 {
			if(ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U'|| ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
			{
				vcount++;
			}
			else
			{
				ccount++;
			}
			}
		}
		System.out.println("number of vowels"+vcount);
		System.out.println("number of consonants"+ccount);
	}
}