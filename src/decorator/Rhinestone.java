package decorator;

public class Rhinestone extends DesignDecorator {
    public Rhinestone(Manicure manicure) {
        super(manicure);
    }
    @Override
    public String getName() {
        return super.getName() + ", rhinestones";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 500;
    }

    @Override
    public int getTime() {
        return super.getTime() + 15;
    }
}
