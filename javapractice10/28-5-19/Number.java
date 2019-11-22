import java.util.Scanner;
class Set
{
   public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int count=0;
      while(n<1)
      {
        int r=n%10;
        count++;
        n=n/10;
      }
      return count;
}
}
   
	
