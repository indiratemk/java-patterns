package abstractfactory;

public class AltelMobileTariff implements MobileTariff {
    @Override
    public void payForMobileTariff() {
        System.out.println("You paid for Altel Mobile Tariff");
    }
}
