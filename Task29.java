class mobile{

    String brand;
    double price;

    mobile(){
        brand = "Samsung";
        price = 25000;
    }

    void displayDetails(){
        System.out.println("Brand = "+brand);
        System.out.println("Price = "+price);
    }
}

public class Task29 {
    public static void main(String[] args) {
        mobile mob = new mobile();
        mob.displayDetails();
    }
}
