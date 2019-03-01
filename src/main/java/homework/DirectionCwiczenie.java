package homework;

// brak obsługi błędu !, nie sprawdzam czy to co user poda jest poprawne

import java.util.Scanner;

public class DirectionCwiczenie {

    public static void getUserDirection()
    {
        Scanner rev = new Scanner(System.in);
        do {
            System.out.print("Podaj kierunek (lub napisz wyjscie):");
            String dir = rev.nextLine();
            if(dir.equals("wyjscie"))
                break;
            System.out.println("Idzimy na " + Directions.valueOf(dir).getTranslation());
        } while(true);
        System.out.println("Wyjscie z programu!");
    }

    public static void displayAll()
    {
        Directions[] dir = Directions.values();

        for (int index = 0; index < dir.length; index++) {
            System.out.println("dir["+index+"] = " + dir[index] + " tłumaczenie=" + dir[index].getTranslation());
        }
    }

    public static void main(String...arg)
    {
        displayAll();
        getUserDirection();
    }
}
