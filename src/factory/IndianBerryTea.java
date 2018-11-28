package factory;

public class IndianBerryTea implements Tea {
    public IndianBerryTea() {
        System.out.println("Indian Berry Tea");
    }

    @Override
    public void process() {
        System.out.println("Tea leaves process...");
    }
}
