class  MainArr
{
    public static void main(String[] args)
     {
	ArrayOperation ao=new ArrayOperation();
         	System.out.println("Enter how many numbers you want");
	int x[]=ao.readArr();
	ao.dispArr(x);
	System.out.println("Enter how many numbers you want");
	int y[]=ao.readArr();
                    ao.dispArr(y);
	System.out.println("after zigzag merge");
	int z[]=ao.zigZag(x,y);
	ao.dispArr(z);
       }
}