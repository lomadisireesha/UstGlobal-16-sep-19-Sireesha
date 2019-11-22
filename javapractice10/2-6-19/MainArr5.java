class  MainArr5
{
    public static void main(String[] args)
     {
	ArrayOperation5 ao=new ArrayOperation5();
         	System.out.println("Enter how many numbers you want");
	int x[]=ao.readArr();
	System.out.println("Enter how many numbers you want");
	int y[]=ao.readArr();
	System.out.println("After merge");	
	int a[]=ao.merge(x,y);
	ao.dispArr(a);
       }
}