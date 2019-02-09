package sdajava20180209.lenic.eu.tictactoe;

public class ConsoleGameArea extends GameArea {

    public ConsoleGameArea(Player g1, Player g2)
    {
        super(g1,g2);
    }

    public void drawConsole()
    {
        for(int row = 0; row < 3; row++)
        {
            System.out.println("| ");
            for(int col = 0; col < 3; col++)
            {
                System.out.println(area[col][row]);
            }
            System.out.println("|");
        }
    }

}
