package decorator;

public class GelManicure implements Manicure {
    @Override
    public String getName() {
        return "Gel Manicure";
    }

    @Override
    public double getPrice() {
        return 3000;
    }

    @Override
    public int getTime() {
        return 60;
    }
}
