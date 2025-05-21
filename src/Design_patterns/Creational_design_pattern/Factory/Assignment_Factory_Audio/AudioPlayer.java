package Design_patterns.Creational_design_pattern.Factory.Assignment_Factory_Audio;

public abstract class AudioPlayer {
    protected int volume;
    protected double playBackRate;

    public abstract void play();
    public abstract void pause();
    public abstract void stop();

    public abstract MediaFormat supportsType();
}
