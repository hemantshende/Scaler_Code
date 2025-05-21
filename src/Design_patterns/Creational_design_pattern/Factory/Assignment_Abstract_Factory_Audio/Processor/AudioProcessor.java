package Design_patterns.Creational_design_pattern.Factory.Assignment_Abstract_Factory_Audio.Processor;

import Design_patterns.Creational_design_pattern.Factory.Assignment_Abstract_Factory_Audio.MediaFormat;

public abstract class AudioProcessor {
    private final byte[] audioData;

    public AudioProcessor(byte[] audioData) {
        this.audioData = audioData;
    }

    public byte[] getAudioData() {
        return audioData;
    }

    public abstract MediaFormat supportsFormat();

    public abstract byte[] process();
}
