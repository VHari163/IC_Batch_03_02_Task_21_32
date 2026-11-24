interface Alert{
    void sendAlert(String message);
}

class EmailAlert implements Alert{
    public void sendAlert(String message){
        System.out.println("Email Alert: " + message);
    }
}

class MobileAlert implements Alert{
    public void sendAlert(String message){
        System.out.println("Mobile Alert: " + message);
    }
}
public class Task26 {
    public static void main(String[] args) {
        EmailAlert email = new EmailAlert();
        MobileAlert mobile = new MobileAlert();

        email.sendAlert("Free Courses are Available");
        mobile.sendAlert("Free Airtel Recharge for 1 Month");
    }
}
