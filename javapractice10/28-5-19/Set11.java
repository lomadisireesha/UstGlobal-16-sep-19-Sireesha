import java.util.Scanner;
class Set11
{
static String decToBin(int dec)
  {
         String bin=" ";
         int count=0;
   		 while(dec!=0)
		  {
   
  			  int r=dec%2;
 			    count++;
 		                     bin=r+bin;
   			dec=dec/2;
		}
                                      System.out.println(count+"no of digits");
			return bin;
 }
   public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println(decToBin(n));
     
}
}
   
	
