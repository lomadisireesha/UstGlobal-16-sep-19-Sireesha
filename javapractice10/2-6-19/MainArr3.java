class  MainArr3
{
    public static void main(String[] args)
     {
	ArrayOperation3 ao=new ArrayOperation3();
         	System.out.println("Enter how many numbers you want");
	int x[]=ao.readArr();
	System.out.println("After delete");	
	int a[]=ao.deleteArr(x,2);
	ao.dispArr(a);
       }
}