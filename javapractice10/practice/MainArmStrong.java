import java.util.Scanner;
class ArmStrong
{
static boolean isArm(int n)
 {
    int sum=0,t=n;
    countDigit c=new countDigit();
     int d=c.cou(n);
    System.out.println(d);
     do{
           int r=n%10;
          sum =sum+pow(r,d);
           n=n/10;
          }while(n!=0);
    
        return sum==t;
}

static  int pow(int n,int p)
  {
     int pw=1;
     while(p>0)
      {
         pw=pw*n;
         p--;
      }
   System.out.println(pw);
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
 class MainArmStrong
  {
     public static void main(String[] args)
      {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
       int num=sc.nextInt();
       if(ArmStrong.isArm(num))
       {
         System.out.println(num +"ArmStrong number");
       }
      else
       {
         System.out.println(num +"not a ArmStrong  number");
      }
       
    }
}
      