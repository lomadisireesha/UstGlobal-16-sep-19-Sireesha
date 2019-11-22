class Conversion
{
  int  decToBin(int dec)
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
 String decToOct(int dec)
  {
         String oct="";
   		 while(dec!=0)
		  {
   
  			  int r=dec%2;
 		                     oct=r+oct;
   			dec=dec/2;
		}
			return oct;
 }

String decToHex(int dec)
{
     String hex="";		while(dec!=0)
		{
			int r=dec%16;
			if(r<10)
			    hex=r+hex;
			else
			    hex=(char)(r+55)+hex;
			   dec=dec/16;
		}
 			return hex;
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
int binToDec(int bin)
{ 
		int dec=0,c=0;
		while(bin!=0)
		{
			int r=bin%10;
			dec=dec+r*pow(2,c++);
			bin=bin/10;
		}
			return dec;
}
String octToDec(int oct)
{
		String dec="";
		int c=0;
		while(oct!=0)
		{
			int r=oct%8;
			dec=dec+r*pow(8,c++);
			oct=oct/8;
		}
			return dec;
}
}

		
		

  