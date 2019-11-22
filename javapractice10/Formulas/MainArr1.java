class  MainArr1
{
    public static void main(String[] args)
     {
	ArrayOperation1 ao=new ArrayOperation1();
         	System.out.println("Enter how many numbers you want");
	int x[]=ao.readArr();
	System.out.print("Enter how many numbers you want");
	int y[]=ao.readArr();
	System.out.println("after  mergeSort");
	int z[]=ao.mergeSort(x,y);
	ao.dispArr(z);
       }
}