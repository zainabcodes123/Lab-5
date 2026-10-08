public class Demo{
public static void main(String args[]){
 
Product p1=new Product("Laptop", 3000, 2 );
p1.displayProduct();

Product p2=new Product("Earpods", 4000, 1 );
p2.displayProduct();

Date d3=new Date(3,6,2006);
Product p3=new Product("Headphones",1500000, 3 ,d3 );
p3.displayProduct();

}
}