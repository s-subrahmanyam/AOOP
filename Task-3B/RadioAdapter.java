// Adapter for radio player
public class RadioAdapter implements MusicSource {
    private RadioPlayer radioPlayer;

    public RadioAdapter(RadioPlayer radioPlayer) {
        this.radioPlayer = radioPlayer;
    }

    @Override
    public void play() {
        radioPlayer.playRadio();
    }
}
