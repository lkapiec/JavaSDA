package sdajava20180209.lenic.eu.tictactoe;

public class TicTacToeGame {

    public static void main()
    {
        Player g1 = new Player("Franek", 'x');
        Player g2 = new Player("Artur", 'o');

        ConsoleGameArea consoleGameArea = new ConsoleGameArea(g1, g2);
        consoleGameArea.move(new Move('A', 1));
        consoleGameArea.drawConsole();
        consoleGameArea.move(new Move('A', 2));
        consoleGameArea.drawConsole();
        consoleGameArea.move(new Move('A', 1));
        consoleGameArea.drawConsole();

    }
}
