package factory;

public class EgyptianGreenTea implements Tea {
    public EgyptianGreenTea() {
        System.out.println("Egyptian Green Tea");
    }

    @Override
    public void process() {
        System.out.println("Egyptian Green Tea leaves process...");
    }
}
