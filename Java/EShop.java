import java.util.*;
public class EShop {
    String name ="";
    double price;
    double totalPrice;
    double d;

    
    public void accept(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name and Price");

        name = sc.nextLine();
        price = sc.nextDouble();
    }

    public void calculate(){
        
        if (price >= 1000 && price <= 25000) {
            d = (5.0 / 100) * price;
        } else if (price > 25000 && price <= 57000) {
            d = (7.5 / 100) * price;
        } else if (price > 57000 && price <= 100000) {
            d = (10.0 / 100) * price;
        } else if (price > 100000) {
            d = (15.0 / 100) * price;
        } else {
            d = 0;
        }
        totalPrice = price-d;
    }
    
    public void display(){
        System.out.println("Name: "+ name);
        System.out.println("Price: "+ price);
        System.out.println("Total price: "+ totalPrice);
    }

    public static void main(String[] args) {
       EShop customer = new EShop();
       customer.accept();
       customer.calculate();
       customer.display(); 
    }


}
