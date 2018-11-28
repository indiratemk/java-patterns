package decorator;

public class Slider extends DesignDecorator {
    public Slider(Manicure manicure) {
        super(manicure);
    }

    @Override
    public String getName() {
        return super.getName() + ", slider";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 500;
    }

    @Override
    public int getTime() {
        return super.getTime() + 30;
    }
}
