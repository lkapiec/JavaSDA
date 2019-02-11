package homework;

public class Cwiczenie1352 {

    public static void main(String[] args)
    {
        int y,x;

        int[][] tablica = new int[8][9]; // y x

        // czyszczenie tablicy
        for(y = 0 ; y < tablica.length ; y++)
        {
            for(x = 0 ; x < tablica[y].length; x++)
            {
                tablica[y][x] = (int) (Math.random() * 11) - 5;
            }
        }

        int[] minKolumny = new int[tablica[0].length];
        int[] maxKolumny = new int[tablica[0].length];

        //System.out.println("kolumn jest = " + tablica[0].length); //6
        //System.out.println("wierszy jest = " + tablica.length); // 3

        int mink = 0,maxk = 0;

        // min kolumny
        for(x = 0 ; x < tablica[0].length ; x++)
        {
            for (y = 0; y < tablica.length; y++)
            {
                if(y == 0)
                {
                    // wartosci tymczasowe
                    mink = tablica[y][x];
                    maxk = tablica[y][x];
                } else
                {
                    if(tablica[y][x] < mink)
                        mink = tablica[y][x];

                    if(tablica[y][x] > maxk)
                        maxk = tablica[y][x];
                }

                //if(tablica[y][x] >= 0) System.out.print(" ");
                //System.out.print(tablica[y][x] + " ");
            }
            minKolumny[x] = mink;
            maxKolumny[x] = maxk;

            //System.out.println();
        }

        //wyswietlamy
        for(y = 0 ; y < tablica.length ; y++)
        {
            for (x = 0; x < tablica[y].length; x++)
            {
                if(tablica[y][x] >= 0) System.out.print(" ");
                System.out.print(tablica[y][x] + " ");
            }
            System.out.println();
        }

        System.out.println("--------------------------");

        for (x = 0; x < tablica[0].length; x++)
        {
            if(minKolumny[x] >= 0) System.out.print(" ");
            System.out.print(minKolumny[x] + " ");
        }

        System.out.println("");

        for (x = 0; x < tablica[0].length; x++)
        {
            if(maxKolumny[x] >= 0) System.out.print(" ");
            System.out.print(maxKolumny[x] + " ");
        }
    }
}
