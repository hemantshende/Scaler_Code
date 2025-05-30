package Machine_Coding.TicTacToe.Strategies;

import Machine_Coding.TicTacToe.Models.*;

import java.util.HashMap;
import java.util.List;

public class Row_WinningStrategy implements WinningStrategy {

    private HashMap<Integer, HashMap<Character, Integer>> rowCounts = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {

//        0 : { 'X' : 1 , 'O' : 0 }
//        1 : { 'X' : 2 , 'O' : 1 }

//        if any player has won the game by having same symbol in a complete row
        int row = move.getCell().getRow();
        Character sym = move.getPlayer().getSymbol().getSymChar();

        if (!rowCounts.containsKey(row)) {
            rowCounts.put(row, new HashMap<>());
        }

        HashMap<Character, Integer> counts = rowCounts.get(row);
        if (!counts.containsKey(sym)) {
            counts.put(sym, 0);
        }

        counts.put(sym, counts.get(sym) + 1);

        if (counts.get(sym) == board.getSize()) {
            return true;
        }

        return false;
    }

    @Override
    public void handleUndo(Board board, Move move) {
        int row = move.getCell().getRow();
        Character sym = move.getPlayer().getSymbol().getSymChar();

        rowCounts.get(row).put(sym, rowCounts.get(row).get(sym) - 1);
    }
}

