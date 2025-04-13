package Machine_Coding.TicTacToe.Models;

import java.util.Scanner;

public class HumanPlayer extends Player{
    private Integer level;
    private Integer coins;
    private Scanner scanner;

    public HumanPlayer(Integer id, String name, Symbol symbol) {
        super(id, name, Player_Type.HUMAN_PLAYER, symbol);
        this.level = 1;
        this.coins=0;
        scanner=new Scanner(System.in);
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public Move makeMove(Board board) {
        System.out.println("plz enter row");
        int row=scanner.nextInt();
        System.out.println("plz enter col");
        int col=scanner.nextInt();

        return new Move(new Cell(row,col),this);
    }
}
