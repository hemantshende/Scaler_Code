package Design_patterns.Creational_design_pattern.Factory.Assignment_Abstract_Factory_Audio.Player;

import Design_patterns.Creational_design_pattern.Factory.Assignment_Abstract_Factory_Audio.MediaFormat;

public class MP3_Player extends AudioPlayer{
    public MP3_Player(int volume, double playBackRate) {
        super(volume, playBackRate);
    }

    @Override
    public void play() {
        // Simulate playing audio in FLAC format
        // Each media format will have its own implementation
        System.out.println("Playing MP3 audio");
    }

    @Override
    public void pause() {
        // Simulate pausing audio in FLAC format
        // Each media format will have its own implementation
        System.out.println("Pausing MP3 audio");
    }

    @Override
    public void stop() {
        // Simulate stopping audio in FLAC format
        // Each media format will have its own implementation
        System.out.println("Stopping MP3 audio");
    }

    public MediaFormat supportsFormat() {
        return MediaFormat.FLAC;
    }
}
