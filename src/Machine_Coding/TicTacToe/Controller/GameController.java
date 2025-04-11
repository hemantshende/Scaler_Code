package Machine_Coding.TicTacToe.Controller;

import Machine_Coding.TicTacToe.Models.Game;
import Machine_Coding.TicTacToe.Models.Game_State;
import Machine_Coding.TicTacToe.Models.Player;
import Machine_Coding.TicTacToe.Strategies.WinningStrategy;

import java.util.List;

public class GameController {
    public Game startGame(int size, List<Player> players, List<WinningStrategy> winningStrategies){
        return new Game(size,players,winningStrategies);
    }
    public void display(Game game){

    }
    public void makeMove(Game game){

    }
    public void undo(Game game){

    }
    public Game_State gameState(Game game){
        return null;
    }

    public Player winner(Game game){
        return null;
    }
}
