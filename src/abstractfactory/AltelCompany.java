package abstractfactory;

public class AltelCompany implements Company {
    @Override
    public HomeInternet createHomeInternet() {
        return new AltelHomeInternet();
    }

    @Override
    public MobileTariff createMobileTariff() {
        return new AltelMobileTariff();
    }


}
