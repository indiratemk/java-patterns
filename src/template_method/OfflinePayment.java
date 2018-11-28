package template_method;

public class OfflinePayment extends Payment {
    @Override
    void makeTransaction(int paymentAmount) {
        System.out.println("You want to pay offline");
        System.out.println("You mustn't pay for commission");
    }
}
