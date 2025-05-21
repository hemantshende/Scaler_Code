package Design_patterns.Creational_design_pattern.Factory.Assignment_Factory_Audio;

public class MP3Player extends AudioPlayer{

    private int volume;
    private double playBackRate;

    public MP3Player(){

    }

    public MP3Player(int volume, double playBackRate) {
        this.volume = volume;
        this.playBackRate = playBackRate;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(volume>10 && volume<=100){
            this.volume = volume;
        }else{
            throw new IllegalArgumentException("volume 11 to 100 ");
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
        System.out.println("MP3 play");

    }

    @Override
    public void pause() {
        System.out.println("MP3 pause");
    }

    @Override
    public void stop() {
        System.out.println("MP3 stop");
    }

    @Override
    public MediaFormat supportsType() {
        return MediaFormat.MP3;
    }
}
