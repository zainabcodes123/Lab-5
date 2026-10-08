public class Product{
private static String id;
private double price;
private int quantity;
static private double maxPrice=0;
static private double minPrice=0;
private String name;
static int counter=1;

Date md;

Product(String name, double price, int quantity){
this(name,price,quantity,new Date(1,1,1));
}


Product(String name, double price, int quantity,Date md ){
this.name=name;
this.price=price;
this.quantity=quantity;
this.id=String.format("p%03d",counter++);

if(counter==1)
minPrice=price;
maxPrice=price;

if(counter>1 && minPrice>price)
minPrice=price;

if(counter>1 && maxPrice<price)
maxPrice=price;

}


 
void displayProduct(){
System.out.println("ID: "+id);
System.out.println("Name:"+name);
System.out.println("Price:"+price);
System.out.println("Max Price:"+maxPrice);
System.out.println("Min Price:"+minPrice);
System.out.println("Quantity:"+quantity);
System.out.println("Date:"+md+"\n");
}
}