package sdajava20180210.lenic.eu;

public class Coordinaties {

    private int row;
    private int col;

    public Coordinaties(int row, int col)
    {
        if((row < 0) || row > 3)
        if((col < 0) || col > 3)
            throw new IllegalStateException("Złe koordynaty");

        this.row = row;
        this.col = col;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }
}
