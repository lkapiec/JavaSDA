package sdajava20180209.lenic.eu.tictactoe;

import java.util.Arrays;
import java.util.List;

public class Move {

    private final char col;
    private final int row;

    private final List<Character>
            properColumns = Arrays.asList('a', 'b', 'c', 'A', 'B','C');
    private  final List<Character>
            properRows = Arrays.asList('1', '2', '3');

    public Move(char col, int row)
    {
        if(properColumns.contains(col) && properRows.contains(row))
        {
            this.row = row;
            this.col = col;

        } else
        {
            throw new IllegalStateException("niepoprawny" + " wiersz lub kolumna");
        }
    }

    public char getCol() {
        return col;
    }

    public int getRow()
    {
        return row;
    }

    public int getRowAsIndex() {
        return col - 1;
    }

    public int getColAsIndex()
    {
        //int result = -1;

        switch(col)
        {
            case 'a':
            case 'A':
                return 0;
                //result =  0;
                //break;
            case 'b':
            case 'B':
                return 1;
                //result = 1;
                //break;
            case 'c':
            case 'C':
                return 2;
                //result = 2;
                //break;
        }
        return -1;
    }
}
