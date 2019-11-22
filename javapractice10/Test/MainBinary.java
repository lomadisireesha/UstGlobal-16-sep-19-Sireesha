class MainBinary
{
	 public  static void main(String[] args)
	{
	    Binary  b=new Binary();
		int dec=567;
		System.out.println("Bin equivalent of"+dec+ "is"+  (b.decToBin(dec)));
	}
}

class Binary
{
static int  decToBin(int dec)
  {
         int bin=0;
   		 while(dec!=0)
		  {
   
  			  int r=dec%2;
 		                     bin=r+bin;
   			dec=dec/2;
		}
			return bin;
 }
}
