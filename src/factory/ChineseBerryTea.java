package factory;

public class ChineseBerryTea implements Tea {
    public ChineseBerryTea() {
        System.out.println("Chinese Berry Tea");
    }

    @Override
    public void process() {
        System.out.println("Chinese Berry Tea leaves process...");
    }
}
