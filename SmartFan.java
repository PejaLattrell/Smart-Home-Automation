public class SmartFan implements Device {
    @Override
    public void turnOn() {
        System.out.println("SmartFan is ON at Level 1.");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartFan is OFF.");
    }

    @Override
    public void increase() {
        System.out.println("Increasing SmrtFan Level.");
        
    }

    @Override
    public void decrease() {
        System.out.println("Decreasing SmartFan Level.");
    }
}
