package Machine_Coding.TicTacToe.Strategies;

import Machine_Coding.TicTacToe.Models.Board;
import Machine_Coding.TicTacToe.Models.Cell;
import Machine_Coding.TicTacToe.Models.Cell_State;
import Machine_Coding.TicTacToe.Models.Move;

import java.util.List;

public class Easy_BotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Move makeMove(Board board) {
        for(List<Cell> row: board.getGrid()){
            for(Cell cell:row){
                if(cell.getCellState().equals(Cell_State.EMPTY)){
                    //make bot move
                }
            }
        }
    }
}
