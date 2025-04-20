package Machine_Coding.TicTacToe.Models;

public abstract class Player {
    private Integer id;
    private String name;
    private Player_Type playerType;
    private Symbol symbol;

    public Player(Integer id, String name, Player_Type playerType, Symbol symbol) {
        this.id = id;
        this.name = name;
        this.playerType = playerType;
        this.symbol = symbol;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player_Type getPlayerType() {
        return playerType;
    }

    public void setPlayerType(Player_Type playerType) {
        this.playerType = playerType;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }


    //methods
    public abstract Move makeMove(Board board);
}
