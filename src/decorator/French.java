package decorator;

public class French extends DesignDecorator {
    public French(Manicure manicure) {
        super(manicure);
    }

    @Override
    public String getName() {
        return super.getName() + ", french";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1500;
    }

    @Override
    public int getTime() {
        return super.getTime() + 90;
    }
}
