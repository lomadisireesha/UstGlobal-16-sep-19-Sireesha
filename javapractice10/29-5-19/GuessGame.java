import java.util.Scanner;
import java.util.Random;
class  GuessGame
{
	 public static void main(String[] args)
	{
		Scanner sc=new  Scanner(System.in);
		System.out.println("Guess the number b/w 0 to 9");
		int n=sc.nextInt();
		Random rd=new Random();
		int r=rd.nextInt(10);
		if(r==n)
		
			System.out.println("you won the game");
		else
			System.out.println("you lose the game"+ r);
		
	}
}	