package strategy;

public class OnlinePayment extends Payment {

    public OnlinePayment() {
        paymentBehavior = new BankCard();
    }

    @Override
    public void displayCheque() {
        System.out.println("Take cheque from mail");
    }
}
