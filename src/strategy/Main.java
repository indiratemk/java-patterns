package strategy;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Payment payment = new OnlinePayment();
        payment.performTransaction();
        payment.setPaymentBehavior(new QiwiWallet());
        payment.performTransaction();

    }
}
