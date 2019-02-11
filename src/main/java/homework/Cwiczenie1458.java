package homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Cwiczenie1458 {

    public static void wczytaj() throws FileNotFoundException
    {
        File plik = new File("src/Nie08122018/ala.txt");
        Scanner wejscie = new Scanner(plik);

        while(wejscie.hasNextLine()) {
            String zdanie = wejscie.nextLine();
            System.out.println(zdanie);
        }
    }

    public static void zapisz() throws FileNotFoundException
    {
        PrintWriter zapis = new PrintWriter("src/Nie08122018/ala.txt");
        zapis.println("Ala ma kota i kot ma alę 2 ");
        zapis.close();
    }

    public static void main(String[] args)
    {
        try {
            zapisz();
            wczytaj();
        } catch (FileNotFoundException e)
        {
            System.out.println("Cholera wyjątek!");
        }
    }

}
