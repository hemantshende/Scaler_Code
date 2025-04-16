package Machine_Coding.TicTacToe;

import Machine_Coding.TicTacToe.Controller.GameController;
import Machine_Coding.TicTacToe.Models.*;
import Machine_Coding.TicTacToe.Strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        GameController gameController=new GameController();

        //to start the game we need
        //1.board size
        //2.players list
        //3.winning strategies

        int size=3;
        List<Player> players=new ArrayList<>();
        players.add(new HumanPlayer(1,"Hemant",new Symbol('x')));
        players.add(new BotPlayer(2,"bot",new Symbol('o'),Bot_Diff_Level.EASY));
        List<WinningStrategy> winningStrategies=new ArrayList<>();

        //flow of the game
        //1-start game
        Game game=gameController.startGame(size,players,winningStrategies);
        //2-display board
        gameController.display(game);
//        while(gameController.gameState(game).equals(Game_State.IN_PROGRESS)){
//            gameController.display(game);
////            gameController.makeMove(game);
//        }

        //3-check game state
        if(gameController.gameState(game).equals(Game_State.SUCCESS)){
            System.out.println("Winner: "+gameController.winner(game).getName());
        }

        if(gameController.gameState(game).equals(Game_State.DRAW)){
            System.out.println("Draw");
        }
    }
}
