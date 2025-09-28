public class Light implements Device {
    @Override
    public void turnOn() {
        System.out.println("Light is ON with brightness at default level.");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is OFF.");
    }

    @Override
    public void increase() {
        System.out.println("Increasing Light brightness.");
    }

    @Override
    public void decrease() {
        System.out.println("Decreasing Light brightness.");
    }
}
