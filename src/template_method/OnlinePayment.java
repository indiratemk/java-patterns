package template_method;

public class OnlinePayment extends Payment {
    private final int commission = 2;

    @Override
    void makeTransaction(int paymentAmount) {
        System.out.println("You want to pay online");
        System.out.println("You need to pay " + (paymentAmount + commission) + "$ with commission");
    }
}
