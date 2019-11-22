class Power
{
 int pow(int n,int p)
{
 int pw=1;
 while(p>0)
   {
        pw=pw*n;
        p--;
   }
    return pw;
}
}
class MainPower
{
  public static void main(String[] args)
   {
     Power p=new Power();
     int x=p.pow(8,3);
     System.out.println("8 power of 3 is" +  x);
     System.out.println("5power of 2 is" +  p.pow(5,2));
   }
}
