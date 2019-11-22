
import java.util.Scanner;
class Strong
{
boolean isStrong(int n)
{
 int sum=0,t=n;
 do{
       int r=n%10;
       sum=sum+fact(r);
       n=n/10;
     }while(n!=0);
   return sum==t;
}
int fact(int x)
{
  int f=1;
  while(x>1)
   {
      f=f*x;
      x--;
   }
  return f;
}
}
class MainStrong
{
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter number");
   int num=sc.nextInt();
   Strong kf=new Strong();
   boolean rs=kf.isStrong(num);
   if(rs)
      System.out.println(num +"strong number");
   else
   System.out.println(num +"not a strong number");
  }
}
