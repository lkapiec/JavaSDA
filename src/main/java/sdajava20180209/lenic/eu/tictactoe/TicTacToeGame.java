package sdajava20180209.lenic.eu.tictactoe;

import sdajava20180209.lenic.eu.tictactoe.gameEngine.Menue;
import sdajava20180209.lenic.eu.tictactoe.gameEngine.Move;
import sdajava20180209.lenic.eu.tictactoe.gameEngine.Player;

import java.util.Scanner;

import static sdajava20180209.lenic.eu.tictactoe.gameEngine.Menue.SelectedOption;
import static sdajava20180209.lenic.eu.tictactoe.gameEngine.Menue.SelectedOption.QUIT;

public class TicTacToeGame {

    public static void main(String... arg) {
        Player g1 = null;
        Player g2 = null;

        Menue menue = new Menue();
        Scanner scanner = new Scanner(System.in);

        SelectedOption opcja;

        do {
            opcja = menue.display();

            switch (opcja) {
                case NEW_GAME: {
                    play(g1, g2);
                    break;
                }
                case GIVE_PLAYER: {

                    System.out.println("pobieramy");

                    if ((g1 == null || g2 == null)) {
                        System.out.println("Podaj nazwe graczy");
                    } else {
                        g1 = getPlayer(scanner, "Podaj imie gracza 1", 'x');
                        g2 = getPlayer(scanner, "Podaj imie gracza 2", 'o');
                        play(g1, g2);
                    }
                    break;
                }
            }
        } while (opcja != QUIT);
    }

    private static void play(Player g1, Player g2) {
        ConsoleGameArea consoleGameArea = new ConsoleGameArea(g1, g2);
        //consoleGameArea.move(new Move('A', 1));
        Scanner sc = new Scanner(System.in);

        boolean successMovment = false;

        do {
            consoleGameArea.drawConsole();
            System.out.println("podaj koordynaty");

            String ruch = sc.next();

            Move move = new Move(ruch.charAt(0), Integer.parseInt(ruch.substring(1, 2)));
            boolean success = consoleGameArea.move(move);

            System.out.println("Status" + success);
        } while (!successMovment || consoleGameArea.isEmptyField() && consoleGameArea.isWinner());

        if(consoleGameArea.isWinner())
        {
            System.out.println("ktos wygral");
        }

    }

    private static Player getPlayer(Scanner scanner, String s, char x) {
        System.out.println(s);
        String imieGracza1 = scanner.next();
        return new Player(imieGracza1, x);
    }
}
