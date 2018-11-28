package abstractfactory;


import java.util.Scanner;

public interface Company {
    HomeInternet createHomeInternet();
    MobileTariff createMobileTariff();

}
