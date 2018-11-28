package factory;

public abstract class TeaFactory {

    public Tea orderTea(String type) {
        Tea tea;
        tea = createTea(type);
        tea.process();

        return tea;
    }

    protected abstract Tea createTea(String type);
}
