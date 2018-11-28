package factory;

public class TeaTest {
    public static void main(String[] args) {
        TeaFactory indianTeaFactory = new IndianTeaFactory();
        TeaFactory chineseTeaFactory = new ChineseTeaFactory();
        TeaFactory egyptianTeaFactory = new EgyptianTeaFactory();

        Tea tea = indianTeaFactory.orderTea("black");

        tea = egyptianTeaFactory.orderTea("black");

        tea = chineseTeaFactory.orderTea("green");

    }
}
