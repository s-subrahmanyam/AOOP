// Base decorator for music playback
public abstract class MusicPlaybackDecorator implements Playback {
    protected Playback decoratedPlayback;

    public MusicPlaybackDecorator(Playback decoratedPlayback) {
        this.decoratedPlayback = decoratedPlayback;
    }

    @Override
    public void playMusic() {
        decoratedPlayback.playMusic();
    }
}
