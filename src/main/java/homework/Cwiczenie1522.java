package homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Cwiczenie1522 {


    public static void wczytaj() throws FileNotFoundException
    {
        File plik = new File("src/Nie08122018/ala.txt");
        Scanner wejscie = new Scanner(plik);
        System.out.println("Imie to: " + wejscie.nextLine());
    }

    public static void zapisz() throws FileNotFoundException
    {
        PrintWriter zapis = new PrintWriter("src/Nie08122018/ala.txt");
        Scanner rev = new Scanner(System.in);

        System.out.print("Podaj imię: ");
        String imie = rev.next();
        zapis.println(imie);
        zapis.close();
    }

    public static void main(String[] args)
    {
        try {
            zapisz();
            wczytaj();
        } catch (FileNotFoundException e)
        {
            System.out.println("Choroba wyjątek!");
        }
    }
}
