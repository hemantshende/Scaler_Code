package Machine_Coding.TicTacToe.Models;

public class HumanPlayer extends Player{
    private Integer level;
    private Integer coins;

    public HumanPlayer(Integer id, String name, Symbol symbol) {
        super(id, name, Player_Type.HUMAN_PLAYER, symbol);
        this.level = 1;
        this.coins=0;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
