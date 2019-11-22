import java.util.Scanner;
class Matrix
{
	int[][] readMat()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many rows & columns");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int mat[][]=new int[r][c];
		System.out.println("	enter"+r*c+"elements row wise");
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
			return mat;
	}
	void dispMat(int mat[][])
	{
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				
				System.out.println(mat[i][j]+" ");
			}
		}
		System.out.println();
	}
	int[][] addMat(int x[][],int y[][])
	{
		if(x.length!=y.length||x[0].length!=y[0].length)
		{
			System.out.println("rows and columns must be same");
			return null;
		}
		int z[][]=new int[x.length][x[0].length];
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				z[i][j]=x[i][j]+y[i][j];
			}
		  }
			 return z;
	}
}		





























































