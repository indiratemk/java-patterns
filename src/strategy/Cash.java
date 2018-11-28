package strategy;

public class Cash implements PaymentBehavior {
    @Override
    public void makeTransaction() {
        System.out.println("I paid by cash");
    }
}
