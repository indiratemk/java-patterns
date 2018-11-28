package factory;

public class ChineseTeaFactory extends TeaFactory {
    @Override
    protected Tea createTea(String type) {
        if(type.equals("black")) {
            return new ChineseBlackTea();
        } else if(type.equals("green")) {
            return new ChineseGreenTea();
        } else if(type.equals("berry")) {
            return new ChineseBerryTea();
        } else {
            return null;
        }
    }
}
