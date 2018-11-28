package template_method;

abstract public class Payment {
    void makePayment(int paymentAmount) {
        displayPaymentAmount(paymentAmount);
        makeTransaction(paymentAmount);
        finishPayment();
    }

    abstract void makeTransaction(int paymentAmount);

    public void displayPaymentAmount(int paymentAmount) {
        System.out.println("You need to pay " + paymentAmount + "$");
    }

    public void finishPayment() {
        System.out.println("Thank you for your payment");
    }
}
