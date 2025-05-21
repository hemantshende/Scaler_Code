package Design_patterns.Creational_design_pattern.Factory.Assignment_Factory_Audio;

public class WAVPlayer extends AudioPlayer{
    private int volume;
    private double playBackRate;

    public WAVPlayer(){

    }
    public WAVPlayer(int volume, double playBackRate) {
        this.volume = volume;
        this.playBackRate = playBackRate;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(volume<=10){
            this.volume = volume;
        }else{
            throw new IllegalArgumentException("volume <=10");
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
        System.out.println("WAV play");

    }

    @Override
    public void pause() {
        System.out.println("WAV pause");
    }

    @Override
    public void stop() {
        System.out.println("WAV stop");
    }

    @Override
    public MediaFormat supportsType() {
        return MediaFormat.WAV;
    }
}
