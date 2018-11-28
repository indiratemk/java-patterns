package decorator;

public class Ombre extends DesignDecorator {
    public Ombre(Manicure manicure) {
        super(manicure);
    }

    @Override
    public String getName() {
        return super.getName() + ", ombre";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1000;
    }

    @Override
    public int getTime() {
        return super.getTime() + 90;
    }
}
