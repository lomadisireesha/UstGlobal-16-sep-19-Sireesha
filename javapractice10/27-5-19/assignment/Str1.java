import java.util.*;
import java.lang.Math;
class Str1
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter the Number");
int a=in.nextInt();
int z=0,re=0;
for(int i=1;i<=a;i++)
{
int n,d=i,s=0;
while(d!=0)
{
	
	n=d%10;
	int r=cal(n);
	s=s+r;
	d=d/10;
}
if(s==i)
{
	re+=i;
	z++;
	System.out.println(i+"Strong");
}

}
System.out.println("Average is "+(re/z));
}
static int cal(int b)
{
int f=1;
for(int i=1;i<=b;i++)
{
f*=i;
}
return f;
}
}
