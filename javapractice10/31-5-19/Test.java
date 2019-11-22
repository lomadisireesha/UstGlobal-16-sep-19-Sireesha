public class Card
{
	public void swipe(){
		System.out.println("swipe the card");
	}
}
public class Debit extends Card
{
	public void swipe(){
		System.out.println("Debit the amount ");
	}
}
public class Credit  extends Card
{
	public void swipe(){
		System.out.println("credit to the amount");
	}
}
public class Test
{
	public static void main(String[] args)
	{
	Credit c=new Credit();
	c.swipe();
	}
}