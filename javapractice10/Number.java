class Number
{
static int countDigit(int n)
{
  int count=0;
  do{
         count++;
         n=n/10;
       }while(n!=0);
   return count;
 }
public static void main(String[] args)
{
System.out.println("main method start");
int dc=countDigits(34678);
System.out.println("number of digits are" +dc);
System.out.println("main method ends");
}
}