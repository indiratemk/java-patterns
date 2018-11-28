package abstractfactory;

public class BeelineHomeInternet implements HomeInternet {
    @Override
    public void paidForHomeInternet() {
        System.out.println("You paid for Beeline Home Internet");
    }
}
