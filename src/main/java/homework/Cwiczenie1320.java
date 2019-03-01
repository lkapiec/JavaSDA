package homework;

public class Cwiczenie1320 {

    public static void main(String[] args)
    {
        int x, y;

        //x y
        int[][] tablica = new int[4][7];




        // czyszczenie tablicy
        for(x = 0 ; x < tablica.length ; x++)
        {
            for(y = 0 ; y < tablica[x].length; y++)
            {
                tablica[x][y] = 0;
            }
        }

        int wiersz = 2;

        for(x = 0 ; x < tablica.length ; x++)
        {
            tablica[x][wiersz] = 1;
        }

        tablica[1][0] = 5;


        // x = 4 / y = 7
        // wyslwelanie tablicy  [4][7] => 4
        for(x = 0 ; x < tablica.length ; x++)
        {
            for (y = 0; y < tablica[x].length; y++)
            {
                //System.out.print(tablica[x][y] + " ");
            }
            System.out.println();
        }
    }
}
