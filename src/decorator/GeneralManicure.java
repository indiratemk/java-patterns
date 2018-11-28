package decorator;

public class GeneralManicure implements Manicure {
    @Override
    public String getName() {
        return "Usual Manicure";
    }

    @Override
    public double getPrice() {
        return 2000;
    }

    @Override
    public int getTime() {
        return 40;
    }
}
