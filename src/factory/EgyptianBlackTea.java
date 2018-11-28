package factory;

public class EgyptianBlackTea implements Tea {
    public EgyptianBlackTea() {
        System.out.println("Egyptian Black Tea");
    }

    @Override
    public void process() {
        System.out.println("Egyptian Black Tea leaves process...");
    }
}
