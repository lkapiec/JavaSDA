package sdajava20180209.lenic.eu.tictactoe.gameEngine;

public class Player {

    public final String name;
    public final char chr;

    public Player(String name, char chr)
    {
        this.name = name;
        this.chr = chr;
    }

    public String getName()
    {
        return this.name;
    }

    public char getChr()
    {
        return this.chr;
    }

}
