import java.util.Scanner;
class PrimeNumber
{
static boolean isPrime(int n)
  {
     int j=2;
     while(j<=n/2)
      {
        if(n%j==0)
           return false;
            j++;
      }
        return true;
 }
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the range");
  int n=sc.nextInt();
  for(int m=1;m<=n;m++)
  {
    if(isPrime(m))
    {
       System.out.println(m);
     }
  }
}
} 