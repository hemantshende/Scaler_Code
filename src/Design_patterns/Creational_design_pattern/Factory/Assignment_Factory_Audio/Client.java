package Design_patterns.Creational_design_pattern.Factory.Assignment_Factory_Audio;

public class Client {
    public static void main(String[] args) {
        /*   (WITHOUT FACTORY)
        //without applying factory design patter
        //tight-coupled to child classes..

        AudioPlayer player1=new FLACPlayer(10,2.0);
        player1.play();
        AudioPlayer player2=new MP3Player(10,2.0);
        player1.play();
        AudioPlayer player3=new WAVPlayer(10,2.0);
        player1.play();

         */

        //after applying factory design pattern
        //its now loosely coupled with child classes
        AudioPlayer player=AudioPlayer_Factory.createPlayer(MediaFormat.MP3);
        player.play();

    }
}
