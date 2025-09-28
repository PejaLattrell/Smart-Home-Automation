import java.util.HashMap;
import java.util.Map;

public class CentralHub {
    private Map<String, Command> commandRegistry = new HashMap<>();

    public void register(String key, Command command) {
        commandRegistry.put(key, command);
    }

    public void send(String key) {
        Command cmd = commandRegistry.get(key);
        if (cmd != null) {
            cmd.execute();
        } else {
            System.out.println("No command registered for: " + key);
        }
    }
}
