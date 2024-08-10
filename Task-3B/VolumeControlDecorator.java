// Decorator for adding volume control functionality
public class VolumeControlDecorator extends MusicPlaybackDecorator {

    public VolumeControlDecorator(Playback decoratedPlayback) {
        super(decoratedPlayback);
    }

    @Override
    public void playMusic() {
        decoratedPlayback.playMusic();
        addVolumeControl();
    }

    private void addVolumeControl() {
        System.out.println("Adjusting volume.");
    }
}
