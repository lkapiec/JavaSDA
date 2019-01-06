package sdajava20181229.lenic.eu;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ListaTestuj {
    public static void main(String...args)
    {
        final int N = 10;

        Lista lista = new Lista(N);

        for(int i = 0; i < N/2; ++i)
        {
            lista.dodajElement((1<<i));
        }

        lista.dodajElement(2);
        lista.dodajElement(8);
        lista.pisz();
        lista.usunPierwszy(2);
        lista.pisz();

        for(int i = 0; i < N/2; ++i)
        {
            lista.dodajElement((1<<i));
        }
        lista.pisz();
        System.out.println("Po usunieciu powtorzen:");
        lista.usunPowtorzenia();
        lista.pisz();
        lista.odwroc();
        lista.pisz();

        try
        {
            lista.zapiszDoPliku("src/sdajava20181229/lenic/eu/lista.txt");
        } catch (FileNotFoundException e)
        {
            System.out.println("Wyjątek");
        } catch (IOException e)
        {
            System.out.println("inny Wyjątek");
        }
    }
}
