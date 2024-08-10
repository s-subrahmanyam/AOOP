// Concrete implementation of playback functionality
public class StandardPlayback implements Playback {
    private MusicSource musicSource;

    public StandardPlayback(MusicSource musicSource) {
        this.musicSource = musicSource;
    }

    @Override
    public void playMusic() {
        musicSource.play();
    }
}
