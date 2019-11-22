import java.util.Scanner;
class Perfect
{
 static boolean isperfect(int no)
  {
    int sum=0;
    int i=1;
    while(i<=n/2)
     {
       if(n%i==0)
       sum=sum+i;
       i++;
     }
   if(sum==no)
      return true;
  else
      return false;
   }
 public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
 if(isperfect(n))
System.out.println(n+" is a perfect num");
else
System.out.println(n+" is not a perfect num");
}
}

  