class  MainArr7
{
    public static void main(String[] args)
     {
	ArrayOperation7 ao=new ArrayOperation7();
         	System.out.println("Enter how many numbers you want");
	int x[]=ao.readArr();
	System.out.println("Enter how many numbers you want");
	int y[]=ao.readArr();
	System.out.println("After intersection");	
	int a[]=ao.inter(x,y);
	ao.dispArr(a);
       }
}