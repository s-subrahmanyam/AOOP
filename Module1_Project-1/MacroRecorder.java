import java.util.ArrayList;
import java.util.List;

public class MacroRecorder {
    private List<Command> commands = new ArrayList<>();
    
    public void record(Command command) {
        commands.add(command);
    }
    
    public void playBack() {
        for (Command command : commands) {
            command.execute();
        }
    }

    public void undoLastCommand() {
        if (!commands.isEmpty()) {
            Command command = commands.remove(commands.size() - 1);
            command.undo();
        }
    }
}
