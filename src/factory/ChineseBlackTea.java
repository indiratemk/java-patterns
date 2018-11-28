package factory;

public class ChineseBlackTea implements Tea {
    public ChineseBlackTea() {
        System.out.println("Chinese Black Tea");
    }

    @Override
    public void process() {
        System.out.println("Chinese Black Tea leaves process...");
    }
}
