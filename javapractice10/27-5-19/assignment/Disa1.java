import java.util.*;
import java.lang.Math;
class Disa1
{
public static void main(String args[])
{
for(int i=1;i<=1000;i++)
{
int b,d,s=0;
b=d=i;
int k=cal(i);
while(d>0)
{
int rem=d%10;
rem=pow(rem,k);
s=s+rem;
d=d/10;
k--;
}
if(s==i)
{
	System.out.println(i+"Disarium");
}

}
}
static int pow(int a,int b)
{
int f=1;
for(int i=1;i<=b;i++)
{
f*=a;
}
return f;
}

static int cal(int b)
{
int c=0;
while(b!=0)
{
int r=b%10;
c++;
b=b/10;
}
return c;
}
}