package Design_patterns.Creational_design_pattern.Factory.Assignment_Abstract_Factory_Audio;

import Design_patterns.Creational_design_pattern.Factory.Assignment_Abstract_Factory_Audio.Player.AudioPlayer;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        System.out.print("enter Media Format...MP3,FLAC");
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        MediaFormat mediaFormat=MediaFormat.valueOf(input);

        AudioFactory audioFactory=null;
        if(mediaFormat==MediaFormat.FLAC){
            audioFactory=new FLAC_Audio_Factory();
        } else if (mediaFormat==MediaFormat.MP3) {
            audioFactory=new MP3_Audio_Factory();
        }else {
            throw new RuntimeException("enter valid input for Mediaformat");
        }

        AudioPlayer player= audioFactory.createAudioPlayer(10,20.0);
//        AudioDecoder decoder= audioFactory.createAudioDecoder();
//        AudioProcessor processor= audioFactory.createAudioProcessor();

        player.play();
        player.stop();
    }
}
