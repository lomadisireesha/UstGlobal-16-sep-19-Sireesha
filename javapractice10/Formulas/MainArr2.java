class  MainArr2
{
    public static void main(String[] args)
     {
	ArrayOperation2 ao=new ArrayOperation2();
         	System.out.println("Enter how many numbers you want");
	int a[]=ao.readArr();
 	ao.mergeSort(a,10);
       }
}