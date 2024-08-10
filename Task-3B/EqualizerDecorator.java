// Decorator for adding equalizer functionality
public class EqualizerDecorator extends MusicPlaybackDecorator {

    public EqualizerDecorator(Playback decoratedPlayback) {
        super(decoratedPlayback);
    }

    @Override
    public void playMusic() {
        decoratedPlayback.playMusic();
        addEqualizer();
    }

    private void addEqualizer() {
        System.out.println("Applying equalizer settings.");
    }
}
