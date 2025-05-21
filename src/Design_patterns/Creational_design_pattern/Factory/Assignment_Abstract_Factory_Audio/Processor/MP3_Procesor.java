package Design_patterns.Creational_design_pattern.Factory.Assignment_Abstract_Factory_Audio.Processor;

import Design_patterns.Creational_design_pattern.Factory.Assignment_Abstract_Factory_Audio.MediaFormat;

public class MP3_Procesor extends AudioProcessor{
    public MP3_Procesor(byte[] audioData) {
        super(audioData);
    }

    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.FLAC;
    }

    @Override
    public byte[] process() {
        // Implement FLAC audio processing logic
        System.out.println("Processing FLAC audio data...");
        // Processing process
        return getAudioData();
    }
}
