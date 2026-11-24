class Product {
    String productName;
    int quantity;
    double price;
    Product(){
        productName = "Unknown";
        quantity = 1;
        price = 100;
    }
    Product(String productName){
        this.productName = productName;
    }
    Product(String productName, int quantity, double price){
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
    void calculateTotal(){
        System.out.println("Total Price: ₹" + (quantity * price));
    }
}

public class Task31 {
    public static void main(String[] args) {
       Product pro = new Product();
       pro.calculateTotal();
       Product pro1 = new Product("Fair&Lovely");
       pro1.calculateTotal();
       Product pro2 = new Product("Ponds",10, 30);
       pro2.calculateTotal(); 
    }
}
