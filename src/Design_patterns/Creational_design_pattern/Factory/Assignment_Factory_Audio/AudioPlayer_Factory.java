package Design_patterns.Creational_design_pattern.Factory.Assignment_Factory_Audio;

public class AudioPlayer_Factory {
    public static AudioPlayer createPlayer(MediaFormat mediaFormat){
        if(mediaFormat==MediaFormat.MP3){
            return new MP3Player();
        } else if (mediaFormat==MediaFormat.WAV) {
            return new WAVPlayer();
        } else if (mediaFormat==MediaFormat.FLAC) {
            return new FLACPlayer();
        }else {
            throw new RuntimeException("plz select correct AudioPlayer");
        }
    }
}
