import java.util.Scanner;
	class BigSmall
	{
	static String bigWord(String st)
	{
		String bword="";
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			String w="";
			while(i<ch.length&&ch[i]!=' ')
			{
				w=w+ch[i];
				i++;
			}
		if(w.length()>bword.length())
		bword=w;
		}
		return bword;
	}
	static String smallWord(String st)
	{
		String sword=st;
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			String w="";
			while(i<ch.length&&ch[i]!=' ')
			{
				w=w+ch[i];
				i++;
			}
		if(w.length()<sword.length())
		sword=w;
		}
		return sword;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  String");
		String s1=sc.nextLine();
		String bw=bigWord(s1);
		System.out.println(bw);
		String sw=smallcWord(s1);
		System.out.println(sw);
	}
}
