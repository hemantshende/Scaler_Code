package Design_patterns.Creational_design_pattern.Factory.Assignment_Abstract_Factory_Audio.Processor;

import Design_patterns.Creational_design_pattern.Factory.Assignment_Abstract_Factory_Audio.MediaFormat;

public class FLAC_Processor extends AudioProcessor{
    public FLAC_Processor(byte[] audioData) {
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
