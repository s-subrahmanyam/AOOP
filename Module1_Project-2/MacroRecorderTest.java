import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MacroRecorderTest {

    private MacroRecorder recorder;

    @Before
    public void setUp() {
        recorder = new MacroRecorder();
    }

    // Test for starting recording
    @Test
    public void testStartRecording() {
        recorder.startRecording();
        assertTrue(recorder.isRecording());
    }

    // Test for recording actions
    @Test
    public void testRecordAction() {
        recorder.startRecording();
        recorder.recordAction("Open File");
        recorder.recordAction("Copy Text");
        assertEquals(2, recorder.getRecordedActions().size());
        assertEquals("Open File", recorder.getRecordedActions().get(0));
    }

    // Test for storing macro
    @Test
    public void testStoreMacro() {
        recorder.startRecording();
        recorder.recordAction("Open File");
        recorder.recordAction("Save File");
        recorder.stopRecording();
        
        recorder.storeMacro("MyMacro");  // Store recorded actions in a named macro
        assertNotNull(recorder.getMacro("MyMacro"));
    }

    // Test for executing a stored macro
    @Test
    public void testExecuteMacro() {
        recorder.startRecording();
        recorder.recordAction("Open File");
        recorder.recordAction("Save File");
        recorder.stopRecording();
        
        recorder.storeMacro("MyMacro");
        boolean executed = recorder.executeMacro("MyMacro");
        
        assertTrue(executed);  // Macro should execute successfully
    }
}
