package Machine_Coding.TicTacToe.Strategies;

import Machine_Coding.TicTacToe.Models.Board;
import Machine_Coding.TicTacToe.Models.Move;

import java.util.HashMap;

public class Diagonal_WinningStrategy implements WinningStrategy {
    private HashMap<Character, Integer> primaryDiagonalCounts = new HashMap<>();
    private HashMap<Character, Integer> secondaryDiagonalCounts = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        int size = board.getSize();
        Character sym = move.getPlayer().getSymbol().getSymChar();
        boolean isWinner = false;

        // Primary diagonal
        if (row == col) {
            primaryDiagonalCounts.put(sym, primaryDiagonalCounts.getOrDefault(sym, 0) + 1);
            if (primaryDiagonalCounts.get(sym) == size) {
                isWinner = true;
            }
        }

        // Secondary diagonal
        if (row + col == size - 1) {
            secondaryDiagonalCounts.put(sym, secondaryDiagonalCounts.getOrDefault(sym, 0) + 1);
            if (secondaryDiagonalCounts.get(sym) == size) {
                isWinner = true;
            }
        }

        return isWinner;
    }

    @Override
    public void handleUndo(Board board, Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        int size = board.getSize();
        Character sym = move.getPlayer().getSymbol().getSymChar();

        if (row == col) {
            primaryDiagonalCounts.put(sym, primaryDiagonalCounts.get(sym) - 1);
        }

        if (row + col == size - 1) {
            secondaryDiagonalCounts.put(sym, secondaryDiagonalCounts.get(sym) - 1);
        }
    }
}
