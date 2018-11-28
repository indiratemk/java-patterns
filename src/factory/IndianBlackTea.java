package factory;

public class IndianBlackTea implements Tea {
    public IndianBlackTea() {
        System.out.println("Indian Black Tea");
    }

    @Override
    public void process() {
        System.out.println("Indian Black Tea leaves process...");
    }
}
