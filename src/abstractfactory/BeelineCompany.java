package abstractfactory;

public class BeelineCompany implements Company {
    @Override
    public HomeInternet createHomeInternet() {
        return new BeelineHomeInternet();
    }

    @Override
    public MobileTariff createMobileTariff() {
        return new BeelineMobileTariff();
    }
}
