// Decorator for adding volume control functionality
public class VolumeControlDecorator extends MusicPlayerDecorator {

    public VolumeControlDecorator(MusicPlayer decoratedPlayer) {
        super(decoratedPlayer);
    }

    @Override
    public void play() {
        decoratedPlayer.play();
        addVolumeControl();
    }

    private void addVolumeControl() {
        System.out.println("Adjusting volume.");
    }
}
