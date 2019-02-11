package homework;

public class Sobota15122018 {

    public static int suma(int...args)
    {
        int wynik = 0;
        for(int index = 0; index < args.length; index++)
        {
            wynik += args[index];
        }
        return wynik;
    }

    public static void main(String...agrs)
    {
        //int wartosc = 0;
        System.out.println(suma());

        int wartosc = 4;
        System.out.println(suma(wartosc));
        System.out.println(suma(wartosc,wartosc));
    }
}
