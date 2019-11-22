import java.util.Scanner;
class Sum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int mat[][]=new int[r][c];
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				mat[i][j]=sc.nextInt();
			}
			System.out.println(mat[i][j]);
		}
	int s[][]=addMat(r,c);
	System.out.println(s);
	}
	static int[][] addMat(int x[][],int y[][])
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