import java.util.ArrayList;
import java.util.HashMap;

public class MacroRecorder {

    private ArrayList<String> recordedActions;
    private boolean isRecording;
    private HashMap<String, ArrayList<String>> macros;

    public MacroRecorder() {
        recordedActions = new ArrayList<>();
        macros = new HashMap<>();
        isRecording = false;
    }

    // Starts recording actions
    public void startRecording() {
        isRecording = true;
        recordedActions.clear();
    }

    // Stops recording actions
    public void stopRecording() {
        isRecording = false;
    }

    // Checks if recording is active
    public boolean isRecording() {
        return isRecording;
    }

    // Records an action
    public void recordAction(String action) {
        if (isRecording) {
            recordedActions.add(action);
        }
    }

    // Gets the list of recorded actions
    public ArrayList<String> getRecordedActions() {
        return recordedActions;
    }

    // Stores a recorded macro by name
    public void storeMacro(String macroName) {
        macros.put(macroName, new ArrayList<>(recordedActions));
    }

    // Retrieves a stored macro by name
    public ArrayList<String> getMacro(String macroName) {
        return macros.get(macroName);
    }

    // Executes a stored macro
    public boolean executeMacro(String macroName) {
        ArrayList<String> macro = getMacro(macroName);
        if (macro != null) {
            for (String action : macro) {
                System.out.println("Executing: " + action);
            }
            return true;
        }
        return false;
    }
}
