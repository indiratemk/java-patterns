package abstractfactory;

public class BeelineMobileTariff implements MobileTariff {
    @Override
    public void payForMobileTariff() {
        System.out.println("You paid for Beeline Mobile Tariff");
    }
}
