package abstractfactory;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        Payment payment = createPayment();
        payment.makePayment();


    }

    public static Payment createPayment() {
        Company company;
        System.out.println("Enter company name for payment: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        if(name.equals("altel")) {
            company = new AltelCompany();
            return new Payment(company);
        } else {
            company = new BeelineCompany();
            return new Payment(company);
        }
    }

}
