public class Main {
    public static void main(String[] args) {
        // Create different music source objects
        LocalFilePlayer localFilePlayer = new LocalFilePlayer();
        OnlineStreamingPlayer onlineStreamingPlayer = new OnlineStreamingPlayer();
        RadioPlayer radioPlayer = new RadioPlayer();

        // Create adapters for different music sources
        MusicSource localSource = new LocalFileAdapter(localFilePlayer);
        MusicSource onlineSource = new OnlineStreamingAdapter(onlineStreamingPlayer);
        MusicSource radioSource = new RadioAdapter(radioPlayer);

        // Create playback objects
        Playback localPlayback = new StandardPlayback(localSource);
        Playback onlinePlayback = new StandardPlayback(onlineSource);
        Playback radioPlayback = new StandardPlayback(radioSource);

        // Add decorators
        Playback equalizedLocalPlayback = new EqualizerDecorator(localPlayback);
        Playback volumeControlledOnlinePlayback = new VolumeControlDecorator(onlinePlayback);
        Playback fullFeaturedRadioPlayback = new EqualizerDecorator(new VolumeControlDecorator(radioPlayback));

        // Play music
        System.out.println("Playing music from local file:");
        equalizedLocalPlayback.playMusic();

        System.out.println("\nPlaying music from online streaming:");
        volumeControlledOnlinePlayback.playMusic();

        System.out.println("\nPlaying music from radio:");
        fullFeaturedRadioPlayback.playMusic();
    }
}
