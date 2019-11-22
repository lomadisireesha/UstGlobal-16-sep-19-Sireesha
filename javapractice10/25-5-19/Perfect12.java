import java.util.Scanner;
class Perfect12
{
 static boolean isperfect(int no)
  {
    int sum=0;
    int i=1;
    while(i<=no/2)
     {
       if(no%i==0)
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
 Perfect11 pe=new Perfect11();
 System.out.println("enter the range");
 int m=sc.nextInt();
 int n==sc.nextInt();
for(;m<=n;m++)
{
 if(isperfect(m))
}
 System.out.println(m+" ");
}
}  