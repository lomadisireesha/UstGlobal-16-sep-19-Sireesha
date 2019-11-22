class Circle
{
  public static void main(String args[])
  {
    System.out.println("main method start");
    circleArea(7.8);
    System.out.println(" ----------------------------");
    circleArea(5.6);
    System.out.println(" ----------------------------");
    circleArea(4.8);
     System.out.println(" main method ends");
  }
static void circleArea(double r)
 {
    System.out.println(" radius is"+ r);
    double ar=3.14*r*r;
    System.out.println(" area is"+ar);
 }
}