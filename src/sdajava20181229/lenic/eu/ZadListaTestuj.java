package sdajava20181229.lenic.eu;

public class ZadListaTestuj {
    public static void main(String...args)
    {
        final int N = 10;

        Lista lista = new Lista(10);


        for(int i = 0; i < N/2; ++i)
        {
            lista.dodajElement((1<<i));
        }

        lista.dodajElement(2);
        lista.dodajElement(8);
        lista.pisz();
        lista.usunPierwszy(2);
        lista.pisz();
        System.out.println("XXXXXX");


        lista.dodajElement(66);
        lista.pisz();

        //for(int i = 0; i < N/2; ++i)
        //{
        //    lista.dodajElement((1<<i));
            //System.out.print(" > "+ (1<<i));
        //}
        //lista.pisz();
        //System.out.println("Po usunieciu powtorzen:");
        //lista.usunPowtorzenia();
        //lista.pisz();
    }
}
