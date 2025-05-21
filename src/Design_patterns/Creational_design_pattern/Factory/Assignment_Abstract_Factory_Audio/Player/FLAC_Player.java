package Design_patterns.Creational_design_pattern.Factory.Assignment_Abstract_Factory_Audio.Player;

import Design_patterns.Creational_design_pattern.Factory.Assignment_Abstract_Factory_Audio.MediaFormat;

public class FLAC_Player extends AudioPlayer{
    public FLAC_Player(int volume, double playBackRate) {
        super(volume, playBackRate);
    }

    @Override
    public void play() {
        // Simulate playing audio in FLAC format
        // Each media format will have its own implementation
        System.out.println("Playing FLAC audio");
    }

    @Override
    public void pause() {
        // Simulate pausing audio in FLAC format
        // Each media format will have its own implementation
        System.out.println("Pausing FLAC audio");
    }

    @Override
    public void stop() {
        // Simulate stopping audio in FLAC format
        // Each media format will have its own implementation
        System.out.println("Stopping FLAC audio");
    }

    public MediaFormat supportsFormat() {
        return MediaFormat.FLAC;
    }
}
