package poov.batalhanaval.model;

public class Parte {
    private int row;
    private int column;
    
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
    public Parte(int row, int column) {
        this.row = row;
        this.column = column;
    }
    public Parte(){
        
    }
    @Override
    public String toString() {
        return "Parte [row=" + row + ", column=" + column + "]";
    }
}
