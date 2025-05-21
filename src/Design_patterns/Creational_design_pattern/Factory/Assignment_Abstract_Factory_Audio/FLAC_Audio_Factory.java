package Design_patterns.Creational_design_pattern.Factory.Assignment_Abstract_Factory_Audio;

import Design_patterns.Creational_design_pattern.Factory.Assignment_Abstract_Factory_Audio.Decoder.AudioDecoder;
import Design_patterns.Creational_design_pattern.Factory.Assignment_Abstract_Factory_Audio.Decoder.FLAC_Decoder;
import Design_patterns.Creational_design_pattern.Factory.Assignment_Abstract_Factory_Audio.Player.AudioPlayer;
import Design_patterns.Creational_design_pattern.Factory.Assignment_Abstract_Factory_Audio.Player.FLAC_Player;
import Design_patterns.Creational_design_pattern.Factory.Assignment_Abstract_Factory_Audio.Processor.AudioProcessor;
import Design_patterns.Creational_design_pattern.Factory.Assignment_Abstract_Factory_Audio.Processor.FLAC_Processor;

public class FLAC_Audio_Factory extends AudioFactory{
    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.FLAC;
    }

    @Override
    public AudioProcessor createAudioProcessor(byte[] audioData) {
        return new FLAC_Processor(audioData);
    }

    @Override
    public AudioPlayer createAudioPlayer(int volume, double playBackRate) {
        return new FLAC_Player(volume,playBackRate);
    }

    @Override
    public AudioDecoder createAudioDecoder(byte[] audioData) {
        return new FLAC_Decoder(audioData);
    }
}
