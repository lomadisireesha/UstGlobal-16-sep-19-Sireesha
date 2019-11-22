 class City
{
 int pincode;
String name;
City(int i,String na){
this.pincode=i;
this.name=na;
}
public static void main(String[] args)
{
 City c1=new City(2315,"anantapur");
System.out.println("pincode:"+c1.pincode+"  "+"name:"+c1.name);
 City c2=new City(2231,"Banglore");
System.out.println("pincode:"+c2.pincode+"  "+"name:"+c2.name);
}
}