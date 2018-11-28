package strategy;

public class QiwiWallet implements PaymentBehavior {
    @Override
    public void makeTransaction() {
        System.out.println("I paid by qiwi wallet");
    }
}
