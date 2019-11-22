 class Product
{
 int id;
String name;
double price;
Product(int i,String na,double p){
this.id=i;
this.name=na;
this.price=p;
}
public static void main(String[] args)
{
 Product p1=new Product(2315,"soap",30);
System.out.println("id:"+p1.id+"name:"+p1.name+"price:"+p1.price);
 Product p2=new Product(2231,"shampoo",2);
System.out.println("id:"+p2.id+"name:"+p2.name+"price:"+p2.price);
}
}