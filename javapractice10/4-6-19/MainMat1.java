class MainMat1
{
	public static void main(String[] args)
	{
		Matrix mt=new Matrix();
		System.out.println("Enter first matrix elements");
		int a[][]=mt.readMat();
		System.out.println("Enter second matrix elements");
		int b[][]=mt.readMat();
		System.out.println("Entered  first matrix elements");
		mt.dispMat(a);
		System.out.println("Entered  second matrix elements");
		mt.dispMat(b);
		int c[][]=mt.addMat(a,b);
		if(c!=null)
		{	
		     System.out.println("Sum of a and b matrix:");
		      mt.dispMat(c);
		}
	}
}