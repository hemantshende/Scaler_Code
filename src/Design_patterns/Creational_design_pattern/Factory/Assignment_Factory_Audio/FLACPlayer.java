package Design_patterns.Creational_design_pattern.Factory.Assignment_Factory_Audio;

public class FLACPlayer extends AudioPlayer{
    private int volume;
    private double playBackRate;

    public FLACPlayer(){

    }
    public FLACPlayer(int volume, double playBackRate) {
        this.volume = volume;
        this.playBackRate = playBackRate;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(volume>100){
            this.volume = volume;
        }else{
            throw new IllegalArgumentException("volume >100");
        }
    }

    public double getPlayBackRate() {
        return playBackRate;
    }

    public void setPlayBackRate(double playBackRate) {
        this.playBackRate = playBackRate;
    }

    @Override
    public void play() {
        System.out.println("FLAC play");

    }

    @Override
    public void pause() {
        System.out.println("FLAC pause");
    }

    @Override
    public void stop() {
        System.out.println("FLAC stop");
    }

    @Override
    public MediaFormat supportsType() {
        return MediaFormat.FLAC;
    }
}
