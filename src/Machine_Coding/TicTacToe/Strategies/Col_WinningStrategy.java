package Machine_Coding.TicTacToe.Strategies;

import Machine_Coding.TicTacToe.Models.*;

import java.util.HashMap;
import java.util.List;

public class Col_WinningStrategy implements WinningStrategy{
    private HashMap<Integer, HashMap<Character, Integer>> columnCounts = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {
        int col = move.getCell().getCol();
        Character sym = move.getPlayer().getSymbol().getSymChar();

        columnCounts.putIfAbsent(col, new HashMap<>());
        HashMap<Character, Integer> counts = columnCounts.get(col);

        counts.put(sym, counts.getOrDefault(sym, 0) + 1);

        return counts.get(sym) == board.getSize();
    }

    @Override
    public void handleUndo(Board board, Move move) {
        int col = move.getCell().getCol();
        Character sym = move.getPlayer().getSymbol().getSymChar();

        columnCounts.get(col).put(sym, columnCounts.get(col).get(sym) - 1);
    }
}
