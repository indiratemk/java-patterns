package template_method;

public class Client {
    public static void main(String[] args) {
        int paymentAmount = 10;
        Payment payment = new OnlinePayment();
        payment.makePayment(paymentAmount);
    }
}
