import java.util.Scanner;
class Str1
{
	public static void main(String[] args)
	{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the sentence");
		 String st=sc.nextLine();
		 int acount=0;
		 int dcount=0;
		 int scount=0;
		 for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z')
			      acount++;
			else if(ch>='0'&&ch<='9')
		 	     dcount++;
			else
			   scount++;
		}
		System.out.println("number of alphabets"+acount);
		System.out.println("number of digits"+dcount);
		System.out.println("number of  specialcharacters"+scount);
	}
}