package factory;

public class ChineseGreenTea implements Tea {
    public ChineseGreenTea() {
        System.out.println("Chinese Green Tea");
    }

    @Override
    public void process() {
        System.out.println("Chinese Green Tea leaves process...");
    }
}
