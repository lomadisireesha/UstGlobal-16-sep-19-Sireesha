class  MainArr9
{
    public static void main(String[] args)
     {
	ArrayOperation9 ao=new ArrayOperation9();
         	System.out.println("Enter how many numbers you want");
	int x[]=ao.readArr();
	System.out.println("Enter how many numbers you want");
	int y[]=ao.readArr();
	System.out.println("After minus");	
	int a[]=ao.minus(x,y);
	ao.dispArr(a);
       }
}