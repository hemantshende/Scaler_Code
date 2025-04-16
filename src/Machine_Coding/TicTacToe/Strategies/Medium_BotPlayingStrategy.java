package Machine_Coding.TicTacToe.Strategies;

import Machine_Coding.TicTacToe.Models.Board;
import Machine_Coding.TicTacToe.Models.Cell;
import Machine_Coding.TicTacToe.Models.Cell_State;
import Machine_Coding.TicTacToe.Models.Move;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Medium_BotPlayingStrategy implements BotPlayingStrategy{

    @Override
    public Move makeMove(Board board) {
        List<Cell> emptyCells=new ArrayList<>();
        for(List<Cell> row:board.getGrid()){
            for(Cell cell:row){
                if(cell.getCellState()== Cell_State.EMPTY){
                    emptyCells.add(cell);
                }
            }
        }
        if(emptyCells.isEmpty()){
            return null;
        }

        Random random=new Random();
        int size= emptyCells.size();
        Cell randomCell=emptyCells.get(random.nextInt(size));

        return new Move(new Cell(randomCell.getRow(), randomCell.getCol()),null);
    }
}
