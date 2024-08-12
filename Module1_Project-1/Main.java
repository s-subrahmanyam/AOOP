public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        MacroRecorder recorder = new MacroRecorder();
        
        // Record actions
        recorder.record(new OpenCommand(document));
        recorder.record(new SaveCommand(document));
        recorder.record(new CloseCommand(document));
        
        // Playback actions
        System.out.println("Playing back commands:");
        recorder.playBack();
        
        // Undo last action
        System.out.println("\nUndoing last command:");
        recorder.undoLastCommand();
    }
}
