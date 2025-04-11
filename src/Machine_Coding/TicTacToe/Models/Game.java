package Machine_Coding.TicTacToe.Models;

import Machine_Coding.TicTacToe.Strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private Integer nextPlayerIndex;
    private Game_State gameState;
    private List<Move> moves;
    private List<WinningStrategy> winningStrategies;
    private Player winner;

    public Game(Integer size, List<Player> players, List<WinningStrategy> winningStrategies) {
        this.board = new Board(size);
        this.players = players;
        this.nextPlayerIndex = 0;
        this.gameState = Game_State.IN_PROGRESS;
        this.moves = new ArrayList<>();
        this.winningStrategies = winningStrategies;
        this.winner = null;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Integer getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(Integer nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public Game_State getGameState() {
        return gameState;
    }

    public void setGameState(Game_State gameState) {
        this.gameState = gameState;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }
}
