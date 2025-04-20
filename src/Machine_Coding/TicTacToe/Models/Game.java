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

    private Game(Integer size, List<Player> players, List<WinningStrategy> winningStrategies) {
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

    //methods
    public void displayBoard(){
        board.displayBoard();
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public boolean validateMove(Move move){  //to validate the move
        int row=move.getCell().getRow();
        int col=move.getCell().getCol();
        if(row<0 || row>=board.getSize() || col<0||col>= board.getSize()){
            return false;
        }

        return board.getGrid().get(row).get(col).getCellState().equals(Cell_State.EMPTY);

    }

    public void updateGameState(Move move,Player currentPlayer){
        // Get the cell from borad.
        // update cell state and put current player symbol in it..
        int row=move.getCell().getRow();
        int col=move.getCell().getCol();

        Cell cellToUpdate=board.getGrid().get(row).get(col);
        cellToUpdate.setCellState(Cell_State.FILLED);
        cellToUpdate.setSymbol(currentPlayer.getSymbol());

        move.setCell(cellToUpdate);
        move.setPlayer(currentPlayer);
        moves.add(move);

        nextPlayerIndex++;
        nextPlayerIndex %= players.size();

    }

    public boolean checkWinner(Board board, Move move){
        for(WinningStrategy winningStrategies: winningStrategies){
           if( winningStrategies.checkWinner(this.board,move)){
               return true;
           }
        }
        return false;
    }

    public void makeMove() {

        //step 1==get current player and ask him to make move
        Player currentPlayer=players.get(nextPlayerIndex);
        System.out.println("its "+ currentPlayer.getName()+"'s move plz make move");
        Move move=currentPlayer.makeMove(board);

        //step 2== validate the move..we have validMove()..
        if(validateMove(move)==false){
            System.out.println("plz make valid move");
            return;
        }
        //step3==update game state
        updateGameState(move,currentPlayer);
        if(checkWinner(board,move)==true){
            winner=currentPlayer;
            gameState=Game_State.SUCCESS;
        } else if (moves.size()>= board.getSize()* board.getSize()) {
            gameState=Game_State.DRAW;
        } else {
            gameState=Game_State.IN_PROGRESS;
        }
    }

    public void undo() {
        if(moves.size()==0){
            System.out.println("there is nothing to do undo..!!!");
            return;
        }

        Move lastMove=moves.get(moves.size()-1);
        moves.remove(moves.size()-1);

        lastMove.getCell().setCellState(Cell_State.EMPTY);
        lastMove.getCell().setSymbol(null);

        nextPlayerIndex--;
        //(A+B)%N==(A+B+N)%N  .........modulo property to handle negative
        nextPlayerIndex=(nextPlayerIndex+players.size())%players.size();

        for(WinningStrategy winningStrategy : winningStrategies){
            winningStrategy.handleUndo(board, lastMove);
        }

        setGameState(Game_State.IN_PROGRESS);
        setWinner(null);
    }

    public static class Builder{
        private Integer size;
        private List<Player> players;
        private List<WinningStrategy> winningStrategies;

        public Builder setSize(Integer size) {
            this.size = size;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }
        public void validate(){
            //validations and exceptions
        }

        public Game build(){
            validate();
            return new Game(size,players,winningStrategies);
        }
    }
}
