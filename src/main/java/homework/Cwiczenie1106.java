package homework;

public class Cwiczenie1106 {

    public static void main(String[] args){
        int[] tablica = new int[]{1,3,5,10};

        System.out.println("Wszytkie for");
        for(int i = 0; i < tablica.length; i++)
        {
            System.out.println(tablica[i]);
        }

        System.out.println("Wszytkie do-while");
        int index = tablica.length;
        do
        {
            index--;
            System.out.println(tablica[index]);
        } while(index>0);

        System.out.println("Wszytkie do-while odwrotnie");
        index = 0;
        do
        {
            System.out.println(tablica[index]);
            index++;
        } while(index < tablica.length);


        System.out.println("Pazyste indeksy");
        for(int i = 0; i < tablica.length; i++)
        {
            if(i % 2 == 0)
            System.out.println(tablica[i]);
        }

        System.out.println("Pazyste liczby");
        for(int i = 0; i < tablica.length; i++)
        {
            int liczba = tablica[i];

            if(liczba % 2 == 0)
                System.out.println(liczba);
        }

        System.out.println("Kolejnosc odwrocona");
        for(int i = (tablica.length - 1); i >= 0; i--)
        {
            System.out.println(tablica[i]);
        }

    }
}
