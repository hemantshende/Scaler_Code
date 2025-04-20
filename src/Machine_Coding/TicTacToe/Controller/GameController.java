package Machine_Coding.TicTacToe.Controller;

import Machine_Coding.TicTacToe.Models.Game;
import Machine_Coding.TicTacToe.Models.Game_State;
import Machine_Coding.TicTacToe.Models.Player;
import Machine_Coding.TicTacToe.Strategies.WinningStrategy;

import java.util.List;

public class GameController {
    public Game startGame(int size, List<Player> players, List<WinningStrategy> winningStrategies){
        return Game
                .getBuilder()
                .setSize(size)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();
    }
    public void display(Game game){
        game.displayBoard();
    }
    public void makeMove(Game game){
        game.makeMove();
    }

    public void undo(Game game){
        game.undo();
    }
    public Game_State gameState(Game game){
        return game.getGameState();
    }
    public Player winner(Game game){
        return game.getWinner();
    }
}
