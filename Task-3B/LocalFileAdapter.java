// Adapter for local file player
public class LocalFileAdapter implements MusicSource {
    private LocalFilePlayer localFilePlayer;

    public LocalFileAdapter(LocalFilePlayer localFilePlayer) {
        this.localFilePlayer = localFilePlayer;
    }

    @Override
    public void play() {
        localFilePlayer.playLocalFile();
    }
}
