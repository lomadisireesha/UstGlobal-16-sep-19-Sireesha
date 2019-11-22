import java.util.Scanner;
class Disarium
{
 boolean isDisarium(int n)
 {
    int sum=0,t=n;
    countDigit c=new countDigit();
    int d=c.cou(n);
     do{
           int r=n%10;
          sum =sum+pow(r,d);
           d--;
           n=n/10;
          }while(n!=0);
        return sum==t;
}

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
class countDigit
 {
 int cou(int n)
{
   int count=0;
    do{
           count++;
            n=n/10;
        } while(n>0);
    return count;
}
}
 class MainDisarium
  {
     public static void main(String[] args)
      {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
       int num=sc.nextInt();
       Disarium kf=new Disarium ();
      boolean rs=kf.isDisarium(num);
      if(rs)
         System.out.println(num  +"Disarium number");
      else
         System.out.println(num  +"not a Disarium  number");
       
    }
}
      