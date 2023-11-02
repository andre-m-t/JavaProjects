package poov.batalhanaval.model;

import java.util.ArrayList;

public class Tabuleiro {
    private int row;
    private int column;
    private ArrayList<Peca> todasPecas;
    
    public int getRow() {
        return row;
    }
    public void setRow(int row) {
        this.row = row;
    }
    public int getColumn() {
        return column;
    }
    public void setColumn(int column) {
        this.column = column;
    }
    public ArrayList<Peca> getTodasPecas() {
        return todasPecas;
    }
    public void setTodasPecas(ArrayList<Peca> todasPecas) {
        this.todasPecas = todasPecas;
    }
    public Tabuleiro(int row, int column, ArrayList<Peca> todasPecas) {
        this.row = row;
        this.column = column;
        this.todasPecas = todasPecas;
    }
    @Override
    public String toString() {
        return "Tabuleiro [row=" + row + ", column=" + column + ", todasPecas=" + todasPecas + "]";
    }
    
}
