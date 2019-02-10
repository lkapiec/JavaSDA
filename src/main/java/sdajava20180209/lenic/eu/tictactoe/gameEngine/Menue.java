package sdajava20180209.lenic.eu.tictactoe.gameEngine;

import java.util.Scanner;

import static java.lang.String.format;

public class Menue {
    public enum SelectedOption {
        NEW_GAME(1,"Rozpocznij nowa gre"),
        GAME_SCORE(2,"Nowa gra"),
        GIVE_PLAYER(3,"Wprowadz nazwe graczy"),
        QUIT(4,"Zakoncz gre");

        private final int menuPosition;
        private final String Description;

        SelectedOption(int i, String s) {
            this.menuPosition = i;
            this.Description = s;
        }

        //public SelectedOption getMenuPosition()
       // {
        //    return SelectedOption.NEW_GAME;//this.
       // }

        public String getMenuDescription()
        {
            return this.Description;//this.
        }
    }

    public SelectedOption display() {

        Scanner scanner = new Scanner(System.in);

        int opcja = SelectedOption.NEW_GAME.menuPosition;

        do {
            System.out.println(format("%d - %s",SelectedOption.NEW_GAME.menuPosition, SelectedOption.NEW_GAME.Description));
            System.out.println(format("%d - %s",SelectedOption.GAME_SCORE.menuPosition, SelectedOption.GAME_SCORE.Description));
            System.out.println(format("%d - %s",SelectedOption.GIVE_PLAYER.menuPosition, SelectedOption.GIVE_PLAYER.Description));
            System.out.println(format("%d - %s",SelectedOption.QUIT.menuPosition, SelectedOption.QUIT.Description));

            opcja = scanner.nextInt();

        } while(opcja < 1 || opcja > 4);

        switch (opcja)
        {
            case 1:
                    return SelectedOption.NEW_GAME;
            case 2:
                    return SelectedOption.GAME_SCORE;
            case 3:
                    return SelectedOption.GIVE_PLAYER;
            case 4:
                    return SelectedOption.QUIT;
            default:
                return SelectedOption.QUIT;
        }
    }
}
