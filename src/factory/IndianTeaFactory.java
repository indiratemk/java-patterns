package factory;

public class IndianTeaFactory extends TeaFactory {
    @Override
    protected Tea createTea(String type) {
        if(type.equals("black")) {
            return new IndianBlackTea();
        } else if(type.equals("green")) {
            return new IndianGreenTea();
        } else if(type.equals("berry")) {
            return new IndianBerryTea();
        } else {
            return null;
        }
    }
}
