public class Main {
    public static void main(String[] args) {
        
        Device light = new Light();
        Device smartfan = new SmartFan();
        Device music = new MusicPlayer();

        // Commands
        Command lightOn = new TurnOnCommand(light);
        Command lightOff = new TurnOffCommand(light);
        Command smartfanOn = new TurnOnCommand(smartfan);
        Command smartfanOff = new TurnOffCommand(smartfan);
        Command musicOn = new TurnOnCommand(music);
        Command musicOff = new TurnOffCommand(music);

        Command increaseMusic = new IncreaseCommand(music);
        Command decreaseMusic = new DecreaseCommand(music);

        // Central Hub
        CentralHub hub = new CentralHub();
        hub.register("light_on", lightOn);
        hub.register("light_off", lightOff);
        hub.register("smartfan_on", smartfanOn);
        hub.register("smartfan_off", smartfanOff);
        hub.register("music_on", musicOn);
        hub.register("music_off", musicOff);
        hub.register("music_up", increaseMusic);
        hub.register("music_down", decreaseMusic);

        // Test commands
        hub.send("light_on");
        hub.send("smartfan_on");
        hub.send("music_on");
        hub.send("music_up");
        hub.send("music_down");
        hub.send("smartfan_off");
        hub.send("light_off");
        hub.send("music_off");
    }
}
