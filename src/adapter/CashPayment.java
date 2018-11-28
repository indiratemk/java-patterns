package adapter;

public class CashPayment implements Payment {
    @Override
    public void makePayment() {
        System.out.println("You paid for purchase with cash...");
    }
}
