package factory;

public class IndianGreenTea implements Tea {
    public IndianGreenTea() {
        System.out.println("Indian Green Tea");
    }

    @Override
    public void process() {
        System.out.println("Indian Green Tea leaves process...");
    }
}
