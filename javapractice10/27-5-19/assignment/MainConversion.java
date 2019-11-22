class MainConversion
{
	 public  static void main(String[] args)
	{
		Conversion cov=new Conversion();
		int dec=567;
		System.out.println("Bin equivalent of"+dec+ "is"+  (cov.decToBin(dec)));
		System.out.println("Oct equivalent of"+dec+ "is"+   (cov.decToOct(dec)));
		System.out.println("Hex equivalent of"+dec+  "is"+   (cov.decToHex(dec)));
		int bin=11101;
		System.out.println("Dec equivalent of"+bin+" is "+    (cov.binToDec(bin)));
		int oct=7654;
		System.out.println("dec equivalent of"+oct+  "is"+     (cov.octToDec(oct)));
	}
}
