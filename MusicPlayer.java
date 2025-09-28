public class MusicPlayer implements Device {
    @Override
    public void turnOn() {
        System.out.println("Music Player is ON. Playing default playlist.");
    }

    @Override
    public void turnOff() {
        System.out.println("Music Player is OFF.");
    }

    @Override
    public void increase() {
        System.out.println("Increasing music volume.");
    }

    @Override
    public void decrease() {
        System.out.println("Decreasing music volume.");
    }
}

