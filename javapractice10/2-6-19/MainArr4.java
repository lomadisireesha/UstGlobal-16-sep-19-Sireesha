class  MainArr4
{
    public static void main(String[] args)
     {
	ArrayOperation4 ao=new ArrayOperation4();
         	System.out.println("Enter how many numbers you want");
	int a[]=ao.readArr();
	System.out.println("Enter how many numbers you want");
	int b[]=ao.readArr();
	System.out.println("After insertion");	
	int x[]=ao.insertArr(a,b,2);
	ao.dispArr(x);
       }
}