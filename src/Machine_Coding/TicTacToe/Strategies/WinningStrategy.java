package Machine_Coding.TicTacToe.Strategies;

import Machine_Coding.TicTacToe.Models.Board;
import Machine_Coding.TicTacToe.Models.Move;

public interface WinningStrategy {
    boolean checkWinner(Board board, Move move);
}
