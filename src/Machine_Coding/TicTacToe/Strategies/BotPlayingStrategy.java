package Machine_Coding.TicTacToe.Strategies;

import Machine_Coding.TicTacToe.Models.Board;
import Machine_Coding.TicTacToe.Models.Move;

public interface BotPlayingStrategy {
    Move makeMove(Board board);
}
