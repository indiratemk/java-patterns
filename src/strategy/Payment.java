package strategy;

public abstract class Payment {
    PaymentBehavior paymentBehavior;

    abstract public void displayCheque();

    public void setPaymentBehavior(PaymentBehavior paymentBehavior) {
        this.paymentBehavior = paymentBehavior;
    }

    public void performTransaction() {
        paymentBehavior.makeTransaction();
    }
}
