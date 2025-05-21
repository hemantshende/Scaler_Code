package Design_patterns.Creational_design_pattern.Factory.Assignment_Abstract_Factory_Audio;

import Design_patterns.Creational_design_pattern.Factory.Assignment_Abstract_Factory_Audio.Decoder.AudioDecoder;
import Design_patterns.Creational_design_pattern.Factory.Assignment_Abstract_Factory_Audio.Player.AudioPlayer;
import Design_patterns.Creational_design_pattern.Factory.Assignment_Abstract_Factory_Audio.Processor.AudioProcessor;

public abstract class AudioFactory {

    public abstract MediaFormat supportsFormat();

    public abstract AudioProcessor createAudioProcessor(byte[] audioData);
    public abstract AudioPlayer createAudioPlayer(int volume, double playBackRate);
    public abstract AudioDecoder createAudioDecoder(byte[] audioData);

}
