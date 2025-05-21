package Design_patterns.Creational_design_pattern.Factory.Assignment_Abstract_Factory_Audio.Decoder;

import Design_patterns.Creational_design_pattern.Factory.Assignment_Abstract_Factory_Audio.MediaFormat;

public class MP3_Decoder extends AudioDecoder{
    public MP3_Decoder(byte[] audioData) {
        super(audioData);
    }

    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.MP3;
    }

    @Override
    public byte[] decode() {
        // Implement FLAC decoding logic
        System.out.println("Decoding FLAC audio data...");
        // Decoding process
        return getAudioData();
    }
}
