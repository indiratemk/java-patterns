package strategy;

public class OfflinePayment extends Payment {

    public OfflinePayment() {
        paymentBehavior = new Cash();
    }

    @Override
    public void displayCheque() {
        System.out.println("Take paper cheque");
    }
}
