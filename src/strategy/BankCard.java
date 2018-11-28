package strategy;

public class BankCard implements PaymentBehavior {
    @Override
    public void makeTransaction() {
        System.out.println("I paid by bank card");
    }
}
