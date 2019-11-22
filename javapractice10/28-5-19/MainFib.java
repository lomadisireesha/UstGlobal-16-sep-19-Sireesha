class MainFib
{
 public static void main(String[] args)
 {
    Fib f=new Fib();
    f.printFb(10);
   System.out.println(f.nThFib(6));
   System.out.println(f.nThFib(10));
 }
}
 class Fib
{
 void printFb(int n)
{
  int f1=0,f2=1;
  while(n>0)
   {
     System.out.print(f1+" ");
      int f3=f1+f2;
      f1=f2;
      f2=f3;
      n--;
   }
  System.out.println();
}
int nThFib(int n)
{
 int f1=0,f2=1;
  while(n>1)
{
  int f3=f1+f2;
      f1=f2;
      f2=f3;
      n--;
   }
   return f1;
}
}

      