package factory;

public class EgyptianBerryTea implements Tea {
    public EgyptianBerryTea() {
        System.out.println("Egyptian Berry Tea");
    }

    @Override
    public void process() {
        System.out.println("Egyptian Berry Tea leaves process...");
    }
}
