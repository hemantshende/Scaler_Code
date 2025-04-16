package Machine_Coding.TicTacToe.Strategies;

import Machine_Coding.TicTacToe.Models.Board;
import Machine_Coding.TicTacToe.Models.Move;

public class Col_WinningStrategy implements WinningStrategy{
    @Override
    public boolean checkWinner(Board board , Move move) {
        return false;
    }
}
