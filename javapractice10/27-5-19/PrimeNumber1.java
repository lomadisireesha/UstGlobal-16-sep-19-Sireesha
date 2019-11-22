import java.util.Scanner;
class PrimeNumber1
{
 boolean isPrime(int n)
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
  PrimeNumber pm=new PrimeNumber();
  System.out.println("enter the range");
  int m=sc.nextInt();
  int n=sc.nextInt();
  int sum=0;
  for(;m<=n;m++)
  {
    if(pm.isPrime(m))
     sum=sum+m;
    }
       System.out.println("sum of prime numbers b/w 1 to " +n+"is"+sum);
     
  }

} 