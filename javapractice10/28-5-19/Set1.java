import java.util.Scanner;
class Set1
{
static int  decToBin(int dec)
  {
         String bin=" ";
         int count=0;
   		 while(dec!=0)
		  {
   
  			  int r=dec%2;
   			  if(r==1)
 			    count++;
 		                     bin=r+bin;
   			dec=dec/2;
		}
			return count;
 }
   public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println(decToBin(n));
      
}
}
   
	
