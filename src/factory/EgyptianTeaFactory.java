package factory;

public class EgyptianTeaFactory extends TeaFactory {
    @Override
    protected Tea createTea(String type) {
        if(type.equals("black")) {
            return new EgyptianBlackTea();
        } else if(type.equals("green")) {
            return new EgyptianGreenTea();
        } else if(type.equals("berry")) {
            return new EgyptianBerryTea();
        } else {
            return null;
        }
    }
}
