import java.util.*;
import java.lang.Math;
public class Arms
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter the value of m and n");
int v=in.nextInt();
int n=in.nextInt();
for(int i=v;i<=n;i++)
{
int c=i;
int b=i;
int s=0;
int k=0;
while(b!=0)
{
	k++;
	b=b/10;
}

while(c!=0)
{
	
	int r=c%10;
	Power h=new Power();
	int m=h.doPower(r,k);
	s=(s+m);
	c=c/10;
	
}
if(s==i)
{
System.out.println(i+"Armstrong Number");
}

}
}
}
class Power
{
	int g=1;
	public int doPower(int item,int b)
	{
		
		while(b>0)
		{
			g=g*item;
			b--;
		}
		return g;
	}
}