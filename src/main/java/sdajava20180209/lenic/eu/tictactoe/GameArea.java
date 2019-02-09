package sdajava20180209.lenic.eu.tictactoe;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
//import java.util.Arrays.asList;

public class GameArea {

    private final char emptyField = ' ';
    private int movments = 0;

    protected char [][] area = {
            {emptyField,emptyField,emptyField},
            {emptyField,emptyField,emptyField},
            {emptyField,emptyField,emptyField}
    };


    private Queue<Player> gameQueue;
    private Player currentPlayer;

    public GameArea(Player g1, Player g2)
    {
        gameQueue = new LinkedList<>(Arrays.asList(g1,g2));
        nextTurn();
    }

    private void nextTurn()
    {
        currentPlayer = gameQueue.poll();
        gameQueue.offer(currentPlayer);

    }

    public boolean move(Move move)
    {
        boolean result = false;

        int row = move.getRow();
        int col = move.getCol();

        if(area[row][col] == emptyField)
        {
            area[row][col] = currentPlayer.getChr();

            if(!isWinner() && isEmptyField()) {
                nextTurn();
            }

            movments++;

            result = true;
        } else
        {
            // stracpna kolejka
            //return  false;

        }
        return result;
    }

    private boolean isWinner() {

        for(int i = 0; i < 3; i++)
        {

        }


        return false;
    }

    private boolean isEmptyField() {
        return movments < 9;
    }

    private boolean isEmptyField2() {
        for(int row = 0; row < 3; row++)
            for(int col = 0; col < 3; col++)
                if(area[row][col] == emptyField)
                return true;
        return false;
    }
}


