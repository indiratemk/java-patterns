package abstractfactory;

public class Payment {
    private HomeInternet homeInternet;
    private MobileTariff mobileTariff;

    public Payment(Company company) {
        this.homeInternet = company.createHomeInternet();
        this.mobileTariff = company.createMobileTariff();
    }

    public void makePayment() {
        homeInternet.paidForHomeInternet();
        mobileTariff.payForMobileTariff();
    }
}
