import java.lang.Override;

abstract class BankAccount{
    abstract double calculateInterest();
    void displayAccountType(){
        System.out.println("Bank Account Details");
    }
}

class SavingsAccount extends BankAccount{
    double balance;
    @Override 
    double calculateInterest(){
        return balance * 0.05; 
    } 
 }

public class Task22 {
    public static void main(String[] args) {
        SavingsAccount save = new SavingsAccount();
        save.balance = 50000;
        save.displayAccountType();
        double intrest = save.calculateInterest();
        System.out.println("Intrest = "+intrest);
    }    
}
