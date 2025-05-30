package Machine_Coding.TicTacToe.Models;

public class Cell {
    private int row;
    private int col;
    private Symbol symbol;
    private Cell_State cellState;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.cellState=Cell_State.EMPTY;
        this.symbol=null;
    }

    public Cell_State getCellState() {
        return cellState;
    }

    public void setCellState(Cell_State cellState) {
        this.cellState = cellState;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public void displayCell(){
        if(cellState==Cell_State.EMPTY){
            System.out.print("|-|");
        }else {
            System.out.print("|"+symbol.getSymChar()+"|");
        }
    }
}
