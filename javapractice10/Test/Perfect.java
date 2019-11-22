import java.util.Scanner;
class Perfect
{
 static boolean isperfect(int n)
  {
    int sum=0;
    int i=1;
    while(i<=n/2)
     {
       if(n%i==0)
       sum=sum+i;
       i++;
     }
   if(sum==n)
      return true;
  else
      return false;
   }
 public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Perfect p=new Perfect();
System.out.println("enter the number");
int n=sc.nextInt();
 if(p.isperfect(n))
System.out.println(n+" is a perfect num");
else
System.out.println(n+" is not a perfect num");
}
}

  