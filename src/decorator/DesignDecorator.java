package decorator;

public abstract class DesignDecorator implements Manicure{
    private Manicure manicure;
    public DesignDecorator(Manicure manicure) {
        this.manicure = manicure;
    }

    public String getName() {
        return manicure.getName();
    }

    public double getPrice() {
        return manicure.getPrice();
    }

    @Override
    public int getTime() {
        return manicure.getTime();
    }
}
