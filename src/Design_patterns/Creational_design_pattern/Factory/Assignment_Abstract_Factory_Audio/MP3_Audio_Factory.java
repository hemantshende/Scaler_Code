package Design_patterns.Creational_design_pattern.Factory.Assignment_Abstract_Factory_Audio;

import Design_patterns.Creational_design_pattern.Factory.Assignment_Abstract_Factory_Audio.Decoder.AudioDecoder;
import Design_patterns.Creational_design_pattern.Factory.Assignment_Abstract_Factory_Audio.Decoder.MP3_Decoder;
import Design_patterns.Creational_design_pattern.Factory.Assignment_Abstract_Factory_Audio.Player.AudioPlayer;
import Design_patterns.Creational_design_pattern.Factory.Assignment_Abstract_Factory_Audio.Player.MP3_Player;
import Design_patterns.Creational_design_pattern.Factory.Assignment_Abstract_Factory_Audio.Processor.AudioProcessor;
import Design_patterns.Creational_design_pattern.Factory.Assignment_Abstract_Factory_Audio.Processor.MP3_Procesor;

public class MP3_Audio_Factory extends AudioFactory{
    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.FLAC;
    }

    @Override
    public AudioProcessor createAudioProcessor(byte[] audioData) {
        return new MP3_Procesor(audioData);
    }

    @Override
    public AudioPlayer createAudioPlayer(int volume, double playBackRate) {
        return new MP3_Player(volume,playBackRate);
    }

    @Override
    public AudioDecoder createAudioDecoder(byte[] audioData) {
        return new MP3_Decoder(audioData);
    }
}
