import java.util.Scanner;
class Perfect11
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
  System.out.println("mms");
  boolean rs=isperfect(28);
 if(rs==true)
   System.out.println(" 28 is perfect num");
else
  System.out.println(" 28 is not a perfect num");
System.out.println(" ----------------------------");
 int x=45;
 boolean rs1=isperfect(x);
  if(rs1==true)
  System.out.println(x+"is a perfect num ");
else
System.out.println(x+" is not a perfect num");
System.out.println(" ----------------------------");
Scanner kb=new Scanner(System.in);
System.out.println("enter the number");
int n=kb.nextInt();
rs1=isperfect(n);
 if(rs1==true)
System.out.println(n+" is a perfect num");
else
System.out.println(n+" is not a perfect num");
}
}

  