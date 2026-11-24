import java.lang.Override;

abstract class Payment{
    double amount;
    Payment(double amount){
        this.amount = amount;
    }
    void showAmount(){
        System.out.println("Payment Amount: ₹" + amount);
    }
    abstract void processPayment();
}

class  UPIPayment extends Payment{
    @Override 
    void processPayment(){
        System.out.println("Payment processed successfully using UPI");
    }
    UPIPayment(){
        super(1000);
    }
}

public class Task23 {
    public static void main(String[] args) {
        UPIPayment upi = new UPIPayment();
        upi.amount = 10000;
        upi.showAmount();
        upi.processPayment();
    }    
}
